package com.service.impl;


import com.dao.CourseDao;
import com.dao.CourseSignDao;
import com.dao.CourseSignTimeDao;
import com.dao.CourseStudentDao;
import com.service.SignService;
import com.utils.Course;
import com.utils.CourseSign;
import com.utils.CourseStudent;
import com.utils.token.DistanceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private CourseDao courseDao;

    @Autowired
    private CourseSignTimeDao courseSignTimeDao;

    @Autowired
    private CourseSignDao courseSignDao;

    @Autowired
    private CourseStudentDao courseStudentDao;

    //开始签到
    @Override
    public int beginSign(Course course) {
        courseDao.updateSignPara(course);
        courseSignTimeDao.addCourseSign(course);
        return 0;
    }

    //获取签到标志isSign
    @Override
    public int getIsSign(Course course) {
        Course cour = courseDao.getIsSign(course);
        return cour.getIsSign();
    }

    //学生签到,返回0代表签到距离测试没通过，1代表签到成功，2代表重复签到
    @Override
    public int Sign(Course course) {
        //获取学生签到信息用于判断学生是否已经签到了
        List<CourseSign> courseSign = courseSignDao.getCourseSign(course);
        if( courseSign.size() != 0) {
            return 2;
        }
        else{
            Course cour1 = courseDao.getLoLa(course);
            //老师的经纬度
            double lo1 = cour1.getLongitude().doubleValue();
            double la1 = cour1.getLatitude().doubleValue();
            //学生的经纬度
            double lo2 = course.getLongitude().doubleValue();
            double la2 = course.getLatitude().doubleValue();
            //计算两个经纬度距离
            DistanceUtils dis = new DistanceUtils();
            double distance = dis.getDistance(la1, lo1, la2, lo2);
            //小于默认距离签到成功，返回标识1，记录到数据库，大于就失败，返回标识0；
            if (distance > cour1.getDefaultDistance()) {
                return 0;
            } else {
                //记录学生签到记录
                courseSignDao.insertCourseSign(course);
                //修改学生对应课程总经验
                cour1.setCourseId(course.getCourseId());
                cour1.setStudentId(course.getStudentId());
                courseStudentDao.updateCourseStudent(cour1);
                return 1;
            }
        }
    }

    //结束签到
    @Override
    public int endSign(Course course) {

        //将对应课程isSign改为0
        courseDao.updateEndSign(course);

        //获取对应课程所有未签到的学生id
        List<CourseStudent> list = courseStudentDao.getNoSignStudent(course);

        //将未签到学生一一记录
        for(int i=0; i<list.size(); i++){
            course.setStudentId(list.get(i).getStudentId());
            courseSignDao.insertNoSign(course);
        }
        return 0;
    }
}

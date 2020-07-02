package com.dao;

import com.utils.Course;
import com.utils.PaperPage;

import java.util.List;

/**
*  @author author
*/
public interface CourseDao {

    List<Course> getCourseByPage(PaperPage paperPage);

    int getCourseCount(PaperPage paperPage);

    int deleteCourseBatchById(List<Long> courseIdList);

    int addCourse(Course course);

    int deleteCourseById(long id);

    int updateCourse(Course course);

    //更新课程参数，距离和经验值
    int updateCoursePara(Course course);

    //开始签到，依据courseId更新对应课程isSign为1，老师经纬度
    int updateSignPara(Course course);

    //结束签到，将对应课程的isSign改为0
    int updateEndSign(Course course);

    // 根据courseId获取IsSign，即是否开启签到
    Course getIsSign(Course course);

    // 学生签到用，根据courseId获取默认距离，默认经验，经纬度
    Course getLoLa(Course course);

    //通过id获取课程信息
    Course getCourseByCourseId(long id);

    List<Course> queryAllCourse();

    List<Course> getOwnCourseByPage(PaperPage paperPage);

    int getOwnCourseCount(PaperPage paperPage);

    Course getCourseInfoByCourseId(long id);
}
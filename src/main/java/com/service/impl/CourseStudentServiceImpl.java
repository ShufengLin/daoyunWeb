package com.service.impl;

import com.dao.CourseStudentDao;
import com.exception.CustomizedException;
import com.service.CourseStudentService;
import com.utils.CourseStudent;
import com.utils.PaperPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseStudentServiceImpl implements CourseStudentService {
    @Autowired
    private CourseStudentDao courseStudentDao;

    @Override
    public Map<String, Object> getCourseStudentByPage(PaperPage paperPage) {
        if(paperPage.getUserName().equals("")) {
            paperPage.setUserName(null);
        }
        int pageSize = paperPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (paperPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            //beginPage = 0;
            throw new CustomizedException("页码不符合规范");
        }
        paperPage.setBeginPage(beginPage);
        List<CourseStudent> courseStudentList = courseStudentDao.getCourseStudentByPage(paperPage);
        //int count = paperDao.getPaperBySelectCount(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", courseStudentList);
        //map.put("total", count);
        return map;
    }

    @Override
    public int getCourseStudentCount(PaperPage paperPage){
        if(paperPage.getUserName().equals("")) {
            paperPage.setUserName(null);
        }
        return courseStudentDao.getCourseStudentCount(paperPage);
    }

    @Override
    public int attendCourse(CourseStudent courseStudent) {
        return courseStudentDao.attendCourse(courseStudent);
    }

    @Override
    public CourseStudent getStudentCourseByTwoId(PaperPage paperPage){
        return courseStudentDao.getStudentCourseByTwoId(paperPage);
    }
}

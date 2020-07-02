package com.service.impl;

import com.dao.CourseDao;
import com.exception.CustomizedException;
import com.service.CourseService;
import com.utils.Course;
import com.utils.Paper;
import com.utils.PaperPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public Map<String, Object> getCourseByPage(PaperPage paperPage) {
        if(paperPage.getCourseName().equals("")) {
            paperPage.setCourseName(null);
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
        List<Course> courseList = courseDao.getCourseByPage(paperPage);
        //int count = paperDao.getPaperBySelectCount(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", courseList);
        //map.put("total", count);
        return map;
    }

    @Override
    public int getCourseCount(PaperPage paperPage){
        if(paperPage.getCourseName().equals("")) {
            paperPage.setCourseName(null);
        }
        return courseDao.getCourseCount(paperPage);
    }

    @Override
    public Course getCourseByCourseId(long id){
        return courseDao.getCourseByCourseId(id);
    }
    @Override
    public int updateCourse(Course course) {
        return courseDao.updateCourse(course);
    }

    @Override
    public int updateCoursePara(Course course) {
        return courseDao.updateCoursePara(course);
    }

    @Override
    public int addCourse(Course course) {
        return courseDao.addCourse(course);
    }

    @Override
    public Map<String, Object> getOwnCourseByPage(PaperPage paperPage) {
        int pageSize = paperPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (paperPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            throw new CustomizedException("页码不符合规范");
        }
        paperPage.setBeginPage(beginPage);
        List<Course> courseList = courseDao.getOwnCourseByPage(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", courseList);
        return map;
    }

    @Override
    public int getOwnCourseCount(PaperPage paperPage) {
        return courseDao.getOwnCourseCount(paperPage);
    }

    @Override
    public Course getCourseInfoByCourseId(long id){
        return courseDao.getCourseInfoByCourseId(id);
    }
}

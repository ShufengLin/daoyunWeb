package com.service;


import com.utils.Course;
import com.utils.PaperPage;

import java.util.List;
import java.util.Map;

public interface CourseService {
    Map<String, Object> getCourseByPage(PaperPage paperPage);

    int getCourseCount(PaperPage paperPage);
//
//    int deletePaperBatchById(List<Long> paperIdList);
//
    int addCourse(Course course);
//
//    int deletePaperById(long id);
//
    int updateCourse(Course course);

    //更新系统参数
    int updateCoursePara(Course course);

    //通过id获取课程信息
    Course getCourseByCourseId(long id);
//
//    Paper queryById(long id);
//
//    List<Paper> queryAllPaper();

    Map<String, Object> getOwnCourseByPage(PaperPage paperPage);
}

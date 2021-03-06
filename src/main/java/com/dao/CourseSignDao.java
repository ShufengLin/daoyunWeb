package com.dao;

import com.utils.Course;
import com.utils.CourseSign;
import com.utils.CourseSignTime;
import com.utils.PaperPage;

import java.util.List;

/**
*  @author author
*/
public interface CourseSignDao {

    //学生签到
    int insertCourseSign(Course course);

    //记录未签到学生
    int insertNoSign(Course course);

    //用于获取学生签到信息来判断学生是否已经签到
    List<CourseSign> getCourseSign(Course course);

    List<CourseSign> getCourseSignByCourseSignId(PaperPage paperPage);

    int getCourseSignCount(PaperPage paperPage);

    List<CourseSign> getStudentSignInfo(CourseSign courseSign);

}
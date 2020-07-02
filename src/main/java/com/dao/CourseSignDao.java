package com.dao;

import com.utils.Course;

/**
*  @author author
*/
public interface CourseSignDao {

    //学生签到
    int insertCourseSign(Course course);

    //记录未签到学生
    int insertNoSign(Course course);

}
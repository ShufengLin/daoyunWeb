package com.dao;

import com.utils.Course;

/**
*  @author author
*/
public interface CourseSignTimeDao {

  //发起签到，更新签到信息，即某门课在什么时候开启了第几次签到
  int addCourseSign(Course course);
}
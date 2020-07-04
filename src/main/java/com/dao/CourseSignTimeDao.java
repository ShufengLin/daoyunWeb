package com.dao;

import com.utils.Course;
import com.utils.CourseSign;
import com.utils.CourseSignTime;
import com.utils.PaperPage;

import java.util.List;

/**
*  @author author
*/
public interface CourseSignTimeDao {

  //发起签到，更新签到信息，即某门课在什么时候开启了第几次签到
  int addCourseSign(Course course);


  List<CourseSignTime> getCourseSignTimeByCourseId(PaperPage paperPage);

  int getCourseSignTimeCount(PaperPage paperPage);
}
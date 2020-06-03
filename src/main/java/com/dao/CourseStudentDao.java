package com.dao;

import com.utils.CourseStudent;
import com.utils.PaperPage;

import java.util.List;

/**
*  @author author
*/
public interface CourseStudentDao {

    List<CourseStudent> getCourseStudentByPage(PaperPage paperPage);

    int getCourseStudentCount(PaperPage paperPage);
}
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

    Course queryById(long id);

    List<Course> queryAllCourse();

    List<Course> getOwnCourseByPage(PaperPage paperPage);
}
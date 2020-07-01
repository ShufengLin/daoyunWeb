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

    //通过id获取课程信息
    Course getCourseByCourseId(long id);

    List<Course> queryAllCourse();

    List<Course> getOwnCourseByPage(PaperPage paperPage);

    int getOwnCourseCount(PaperPage paperPage);
}
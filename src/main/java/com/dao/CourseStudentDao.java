package com.dao;

import com.utils.Course;
import com.utils.CourseStudent;
import com.utils.PaperPage;

import java.util.List;

/**
*  @author author
*/
public interface CourseStudentDao {

    List<CourseStudent> getCourseStudentByPage(PaperPage paperPage);

    int getCourseStudentCount(PaperPage paperPage);

    // 根据studentId更新对应学生总经验表
    int updateCourseStudent(Course course);

    //结束签到使用，根据courseId获取对应课程所有未签到的学生id
    List<CourseStudent> getNoSignStudent(Course course);

    int attendCourse(CourseStudent courseStudent);

    CourseStudent getStudentCourseByTwoId(PaperPage paperPage);
}
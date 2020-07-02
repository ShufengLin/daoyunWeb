package com.service;

import com.utils.CourseStudent;
import com.utils.PaperPage;

import java.util.Map;

public interface CourseStudentService {

    Map<String, Object> getCourseStudentByPage(PaperPage paperPage);

    int getCourseStudentCount(PaperPage paperPage);

    int attendCourse(CourseStudent courseStudent);
}

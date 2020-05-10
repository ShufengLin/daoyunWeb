package com.service;

import com.utils.PaperPage;
import com.utils.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User checkUser(User loginUser);

    Map<String, Object> getTeacherByPage(PaperPage paperPage);

    Map<String, Object> getStudentByPage(PaperPage paperPage);

    int getTeacherCount(PaperPage paperPage);

    int getStudentCount(PaperPage paperPage);
}

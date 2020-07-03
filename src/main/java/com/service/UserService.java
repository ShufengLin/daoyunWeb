package com.service;

import com.utils.PaperPage;
import com.utils.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User checkUser(User loginUser);

    /**
     * 检测修改密码参数合法性并且修改密码
     * @param loginUser
     */
    void checkUserOldPassword(User loginUser);

    Map<String, Object> getTeacherByPage(PaperPage paperPage);

    Map<String, Object> getStudentByPage(PaperPage paperPage);

    int getTeacherCount(PaperPage paperPage);

    int getStudentCount(PaperPage paperPage);

    /**
     * 修改用户包括老师和学生两个角色
     * @param user
     * @return
     */
    int updateUser(User user);
    /**
     * 添加老师
     * @param user
     * @return
     */
    int addTeacher(User user);

    /**
     * 添加学生
     * @param user
     * @return
     */
    int addStudent(User user);

    User getUserInfoById(User user);
}

package com.dao;

import java.util.List;

import com.utils.PaperPage;
import org.apache.ibatis.annotations.Param;
import com.utils.User;
/**
*  @author author
*/
public interface UserDao {
    User checkUser(User loginUser);

    void updateUserPassword(User loginUser);

    List<User> getTeacherByPage(PaperPage paperPage);

    List<User> getStudentByPage(PaperPage paperPage);

    int getTeacherCount(PaperPage paperPage);

    int getStudentCount(PaperPage paperPage);

    int updateUser(User user);

    int addUser(User user);

    User getUserInfoById(User user);
}
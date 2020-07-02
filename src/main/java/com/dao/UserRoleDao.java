package com.dao;

import com.utils.Course;
import com.utils.PaperPage;
import com.utils.UserRole;

import java.util.List;

/**
*  @author author
*/
public interface UserRoleDao {

    /**
     * 获取用户角色对应表
     * @param paperPage
     * @return
     */
    List<UserRole> getUserRoleByPage(PaperPage paperPage);

    /**
     * 获取用户角色数量
     * @param paperPage
     * @return
     */
    int getUserRoleCount(PaperPage paperPage);

    /**
     * 修改账号角色
     * @param userRole
     * @return
     */
    int updateUserRole(UserRole userRole);
    /**
     * 给账号添加老师角色
     * @return
     */
    int addTeacherRole();

    /**
     * 给账号添加学生角色
     * @return
     */
    int addStudentRole();

    /**
     * 給账号添加用户角色
     * @return
     */
    int addUserRole(UserRole userRole);

    UserRole getUserRoleByUserId(long userId);
}
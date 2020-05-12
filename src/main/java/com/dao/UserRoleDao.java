package com.dao;

import com.utils.UserRole;

/**
*  @author author
*/
public interface UserRoleDao {

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
}
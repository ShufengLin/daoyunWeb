package com.dao;

import com.utils.PaperPage;
import com.utils.Role;

import java.util.List;

/**
*  @author author
*/
public interface RoleDao {
    List<Role> getAllRole();

    List<Role> getRoleByPage(PaperPage paperPage);

    int getRoleCount(PaperPage paperPage);

    int addRole(Role role);

    int getMaxRoleId();
}
package com.service;

import com.utils.PaperPage;
import com.utils.Role;

import java.util.Map;

public interface RoleService {
    Map<String, Object> getRoleByPage(PaperPage paperPage);

    int getRoleCount(PaperPage paperPage);

    Map<String, Object> getAllPermission();

    int addRole(Role role);

    Map<String, Object> getOwnPermissionByRoleId(Role role);
}

package com.service;

import com.utils.PaperPage;
import com.utils.UserRole;

import java.util.Map;

public interface UserRoleService {
    Map<String, Object> getUserRoleByPage(PaperPage paperPage);

    int getUserRoleCount(PaperPage paperPage);

    Map<String, Object> getAllRole();

    public int updateUserRole(UserRole userRole);
}

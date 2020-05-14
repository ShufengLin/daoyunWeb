package com.dao;

import com.utils.Permision;
import com.utils.Role;

import java.util.List;

/**
*  @author author
*/
public interface PermisionDao {

    List<Permision> getAllPermission();

    List<String> getOwnPermissionByRoleId(Role role);
}
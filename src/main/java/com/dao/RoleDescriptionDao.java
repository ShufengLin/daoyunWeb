package com.dao;


import com.utils.Roledescription;

/**
*  @author author
*/
public interface RoleDescriptionDao {

    int addRoleDescription(Roledescription rd);

    int deleteRightByRoleId(long id);

}
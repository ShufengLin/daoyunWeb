package com.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.UserRole;
/**
*  @author author
*/
public interface UserRoleBaseMapper {

    int insertUserRole(UserRole object);

    int updateUserRole(UserRole object);

    int update(UserRole.UpdateBuilder object);

    List<UserRole> queryUserRole(UserRole object);

    UserRole queryUserRoleLimit1(UserRole object);

}
package com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.utils.User;
/**
*  @author author
*/
public interface UserDao {
    User checkUser(User loginUser);

}
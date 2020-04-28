package com.service.impl;

import com.dao.userDao;
import com.exception.CustomizedException;
import com.service.UserService;
import com.utils.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private userDao userServiceDao;

    @Override
    public user checkUser (user loginUser){
        if(loginUser.getUserName() == null || loginUser.getUserName().equals(""))
        {
            throw new CustomizedException("用户名不能为空");
        }
        if(loginUser.getPassword() == null || loginUser.getPassword().equals(""))
        {
            throw new CustomizedException("密码不能为空");
        }

        user userDetail = userServiceDao.checkUser(loginUser);
        if(userDetail == null)
        {
            throw new CustomizedException("用户名或密码错误");
        }
        return userDetail;
    }

}

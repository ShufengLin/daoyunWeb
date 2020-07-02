package com.service.impl;

import com.dao.RoleDao;
import com.dao.UserDao;
import com.dao.UserRoleDao;
import com.exception.CustomizedException;
import com.service.UserRoleService;
import com.utils.PaperPage;
import com.utils.Role;
import com.utils.User;
import com.utils.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> getUserRoleByPage(PaperPage paperPage) {
        if(paperPage.getUserName().equals("")) {
            paperPage.setUserName(null);
        }
        int pageSize = paperPage.getPageSize();
        if (pageSize == 0) {
            pageSize = 10;
        }
        int beginPage = (paperPage.getPage() - 1) * pageSize;
        if (beginPage < 0) {
            //beginPage = 0;
            throw new CustomizedException("页码不符合规范");
        }
        paperPage.setBeginPage(beginPage);
        List<UserRole> userRoleList = userRoleDao.getUserRoleByPage(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", userRoleList);
        return map;
    }

    @Override
    public int getUserRoleCount(PaperPage paperPage){
        if(paperPage.getUserName().equals("")) {
            paperPage.setUserName(null);
        }
        return userRoleDao.getUserRoleCount(paperPage);
    }

    @Override
    public Map<String, Object> getAllRole(){
        List<Role> RoleList = roleDao.getAllRole();
        Map<String, Object> map = new HashMap<>();
        map.put("data", RoleList);
        return map;
    }

    @Override
    public int updateUserRole(UserRole userRole) {
        return userRoleDao.updateUserRole(userRole);
    }

    @Override
    public int addUserRole(UserRole userRole) {
        User user = new User();
        user.setUserName(userRole.getUserName());
        userDao.addUser(user);
        userRoleDao.addUserRole(userRole);
        return 0;
    }

    @Override
    public UserRole getUserRoleByUserId(long userId) {
        return userRoleDao.getUserRoleByUserId(userId);
    }
}

package com.service.impl;

import com.dao.UserDao;
import com.exception.CustomizedException;
import com.service.UserService;
import com.utils.PaperPage;
import com.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userServiceDao;

    @Override
    public User checkUser (User loginUser){
        if(loginUser.getUserName() == null || loginUser.getUserName().equals(""))
        {
            throw new CustomizedException("用户名不能为空");
        }
        if(loginUser.getPassword() == null || loginUser.getPassword().equals(""))
        {
            throw new CustomizedException("密码不能为空");
        }

        User userDetail = userServiceDao.checkUser(loginUser);
        if(userDetail == null)
        {
            throw new CustomizedException("用户名或密码错误");
        }
        return userDetail;
    }

    @Override
     public Map<String, Object> getTeacherByPage(PaperPage paperPage){
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
        List<User> teacherList = userServiceDao.getTeacherByPage(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", teacherList);
        return map;
    }

    @Override
    public Map<String, Object> getStudentByPage(PaperPage paperPage){
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
        List<User> studentList = userServiceDao.getStudentByPage(paperPage);
        Map<String, Object> map = new HashMap<>();
        map.put("data", studentList);
        return map;
    }

    @Override
    public int getTeacherCount(PaperPage paperPage){
        if(paperPage.getUserName().equals("")) {
            paperPage.setUserName(null);
        }
        return userServiceDao.getTeacherCount(paperPage);
    }

    @Override
    public int getStudentCount(PaperPage paperPage){
        if(paperPage.getUserName().equals("")) {
            paperPage.setUserName(null);
        }
        return userServiceDao.getStudentCount(paperPage);
    }

}

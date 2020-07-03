package com.service.impl;

import com.dao.UserDao;
import com.dao.UserRoleDao;
import com.exception.CustomizedException;
import com.service.UserService;
import com.utils.PaperPage;
import com.utils.User;
import com.utils.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userServiceDao;

    @Autowired
    private UserRoleDao userRoleDao;

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
    public void checkUserOldPassword (User loginUser){
        if(loginUser.getUserName() == null || loginUser.getUserName().equals(""))
        {
            throw new CustomizedException("用户名信息不完整");
        }
        if(loginUser.getPassword() == null || loginUser.getPassword().equals(""))
        {
            throw new CustomizedException("旧密码不能为空");
        }
        if(loginUser.getNewPassword() == null || loginUser.getNewPassword().equals("")){
            throw new CustomizedException("新密码不能为空");
        }
        User userDetail = userServiceDao.checkUser(loginUser);
        if(userDetail == null)
        {
            throw new CustomizedException("输入的旧密码错误");
        }
        userServiceDao.updateUserPassword(loginUser);
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

    @Override
    public int updateUser(User user) {
        return userServiceDao.updateUser(user);
    }

    @Override
    public int addTeacher(User user){
        userServiceDao.addUser(user);
        userRoleDao.addTeacherRole();
        return 0;
    }

    @Override
    public int addStudent(User user){
        userServiceDao.addUser(user);
        userRoleDao.addStudentRole();
        return 0;
    }

    @Override
    public User getUserInfoById (User user){
        User result = userServiceDao.getUserInfoById(user);
        return result;
    }

    @Override
    public void register(User registerUser){
        User checkExist = userServiceDao.getUserByName(registerUser);
        if(checkExist!=null){//说明已经存在用户名一样的账号
            throw new CustomizedException("已经存在相同的用户名！");
        }else{
            userServiceDao.addUser(registerUser);
            UserRole userRole = new UserRole();
            userRole.setRoleName(registerUser.getRoleName());
            userRoleDao.addUserRole(userRole);
        }
    }

}

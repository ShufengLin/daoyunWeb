package com.utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class User implements Serializable {

    private static final long serialVersionUID = 1586522786098L;

    private long userId;

    private String userName;

    private String userEducation;


    private String phoneNumber;


    private String password;


    private String school;

    private String academy;


    private String major;

    private String newPassword; //用于修改密码


    public void setUserId(long userId){this.userId = userId;}

    public long getUserId(){return this.userId;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setUserEducation(String userEducation){this.userEducation = userEducation;}

    public String getUserEducation(){return this.userEducation;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getPhoneNumber(){return this.phoneNumber;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setSchool(String school){this.school = school;}

    public String getSchool(){return this.school;}

    public void setAcademy(String academy){this.academy = academy;}

    public String getAcademy(){return this.academy;}

    public void setMajor(String major){this.major = major;}

    public String getMajor(){return this.major;}

    public void setNewPassword(String newPassword){this.newPassword = newPassword;}

    public String getNewPassword(){return this.newPassword;}
   
}

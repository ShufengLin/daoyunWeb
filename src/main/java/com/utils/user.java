package com.utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class user implements Serializable {

    private static final long serialVersionUID = 1586522786098L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 
    * isNullAble:1
    */
    private String userName;

    /**
    * 
    * isNullAble:1
    */
    private String userEducation;

    /**
    * 
    * isNullAble:1
    */
    private String phoneNumber;

    /**
    * 
    * isNullAble:1
    */
    private String password;

    /**
    * 
    * isNullAble:1
    */
    private String school;

    /**
    * 
    * isNullAble:1
    */
    private String academy;

    /**
    * 
    * isNullAble:1
    */
    private String major;


    public void setUserId(Integer userId){this.userId = userId;}

    public Integer getUserId(){return this.userId;}

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
   
}

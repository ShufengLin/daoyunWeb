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
    private Integer UserId;

    /**
    * 
    * isNullAble:1
    */
    private String UserName;

    /**
    * 
    * isNullAble:1
    */
    private String UserEducation;

    /**
    * 
    * isNullAble:1
    */
    private String PhoneNumber;

    /**
    * 
    * isNullAble:1
    */
    private String Password;

    /**
    * 
    * isNullAble:1
    */
    private String School;

    /**
    * 
    * isNullAble:1
    */
    private String Academy;

    /**
    * 
    * isNullAble:1
    */
    private String Major;


    public void setUserId(Integer UserId){this.UserId = UserId;}

    public Integer getUserId(){return this.UserId;}

    public void setUserName(String UserName){this.UserName = UserName;}

    public String getUserName(){return this.UserName;}

    public void setUserEducation(String UserEducation){this.UserEducation = UserEducation;}

    public String getUserEducation(){return this.UserEducation;}

    public void setPhoneNumber(String PhoneNumber){this.PhoneNumber = PhoneNumber;}

    public String getPhoneNumber(){return this.PhoneNumber;}

    public void setPassword(String Password){this.Password = Password;}

    public String getPassword(){return this.Password;}

    public void setSchool(String School){this.School = School;}

    public String getSchool(){return this.School;}

    public void setAcademy(String Academy){this.Academy = Academy;}

    public String getAcademy(){return this.Academy;}

    public void setMajor(String Major){this.Major = Major;}

    public String getMajor(){return this.Major;}
   
}

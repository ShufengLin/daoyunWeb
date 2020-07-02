package com.utils;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Course {

  private long courseId;
  private String courseName;
  private long courseHour;
  private long teachId;
  private String userName;
  //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date startTime;
  private String coursePlace;
  private int defaultDistance;
  private int isSign;
  private int defaultExp;

  //////////////
  //课程对应教师的个人信息
  private String phoneNumber;
  private String school;
  private String academy;
  private String major;


  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }


  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }


  public long getCourseHour() {
    return courseHour;
  }

  public void setCourseHour(long courseHour) {
    this.courseHour = courseHour;
  }


  public long getTeachId() {
    return teachId;
  }

  public void setTeachId(long teachId) {
    this.teachId = teachId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public String getCoursePlace() {
    return coursePlace;
  }

  public void setCoursePlace(String coursePlace) {
    this.coursePlace = coursePlace;
  }

  public int getDefaultDistance() {
    return defaultDistance;
  }

  public void setDefaultDistance(int defaultDistance) {
    this.defaultDistance = defaultDistance;
  }

  public int getIsSign() {
    return isSign;
  }

  public void setIsSign(int isSign) {
    this.isSign = isSign;
  }

  public int getDefaultExp() {
    return defaultExp;
  }

  public void setDefaultExp(int defaultExp) {
    this.defaultExp = defaultExp;
  }

  public void setSchool(String school){this.school = school;}

  public String getSchool(){return this.school;}

  public void setAcademy(String academy){this.academy = academy;}

  public String getAcademy(){return this.academy;}

  public void setMajor(String major){this.major = major;}

  public String getMajor(){return this.major;}

  public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

  public String getPhoneNumber(){return this.phoneNumber;}

}

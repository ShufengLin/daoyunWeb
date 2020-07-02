package com.utils;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
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
  private double defaultDistance;
  private int isSign;
  private long defaultExp;
  //老师发起签到时的经度
  private BigDecimal longitude;
  //老师发起签到时的纬度
  private BigDecimal latitude;
  //这个属性不在表中，用于签到时接收学生id用
  private long studentId;

  //////////////
  //课程对应教师的个人信息
  private String phoneNumber;
  private String school;
  private String academy;
  private String major;

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

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

  public double getDefaultDistance() {
    return defaultDistance;
  }

  public void setDefaultDistance(double defaultDistance) {
    this.defaultDistance = defaultDistance;
  }

  public int getIsSign() {
    return isSign;
  }

  public void setIsSign(int isSign) {
    this.isSign = isSign;
  }

  public long getDefaultExp() {
    return defaultExp;
  }

  public void setDefaultExp(long defaultExp) {
    this.defaultExp = defaultExp;
  }

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
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

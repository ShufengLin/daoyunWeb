package com.utils;


import java.util.Date;

public class Course {

  private long courseId;
  private String courseName;
  private long courseHour;
  private long teachId;
  private String userName;
  private Date startTime;
  private String coursePlace;


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

}

package com.utils;

import java.util.Date;

public class CourseSign {

  private long signId;
  private long courseId;
  private long studentId;
  private String signPlace;
  private Date signTime;
  private long signStatus;
  //这个是代表是某门课的某次签到，外键，依据coursesigntime表的courseSignId
  private long courseSignId;


  public long getSignId() {
    return signId;
  }

  public void setSignId(long signId) {
    this.signId = signId;
  }


  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }


  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public String getSignPlace() {
    return signPlace;
  }

  public void setSignPlace(String signPlace) {
    this.signPlace = signPlace;
  }


  public Date getSignTime() {
    return signTime;
  }

  public void setSignTime(Date signTime) {
    this.signTime = signTime;
  }


  public long getSignStatus() {
    return signStatus;
  }

  public void setSignStatus(long signStatus) {
    this.signStatus = signStatus;
  }

  public long getCourseSignId() {
    return courseSignId;
  }

  public void setCourseSignId(long courseSignId) {
    this.courseSignId = courseSignId;
  }

}

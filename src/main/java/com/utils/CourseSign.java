package com.utils;

public class CourseSign {

  private long signId;
  private long courseId;
  private long studentId;
  private String signPlace;
  private java.sql.Timestamp signTime;
  private long signStatus;


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


  public java.sql.Timestamp getSignTime() {
    return signTime;
  }

  public void setSignTime(java.sql.Timestamp signTime) {
    this.signTime = signTime;
  }


  public long getSignStatus() {
    return signStatus;
  }

  public void setSignStatus(long signStatus) {
    this.signStatus = signStatus;
  }

}

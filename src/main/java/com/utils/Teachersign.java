package com.utils;


public class Teachersign {

  private long teacherSignId;
  private long teacherId;
  private long courseId;
  private java.sql.Timestamp date;


  public long getTeacherSignId() {
    return teacherSignId;
  }

  public void setTeacherSignId(long teacherSignId) {
    this.teacherSignId = teacherSignId;
  }


  public long getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(long teacherId) {
    this.teacherId = teacherId;
  }


  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

}

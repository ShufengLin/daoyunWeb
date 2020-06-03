package com.utils;


public class CourseStudent {

  private long id;
  private long courseId;
  private long studentId;
  private String studentName;
  private long studentExp;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public long getStudentExp() {
    return studentExp;
  }

  public void setStudentExp(long studentExp) {
    this.studentExp = studentExp;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

}

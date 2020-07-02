package com.utils;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 老师发起签到记录表(记录对应课程老师什么时候发起签到的表，一个课程有多次签到)
 */
public class CourseSignTime {

  private long courseSignId;
  private long courseId;
  //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date beginTime;

  public long getCourseSignId() {
    return courseSignId;
  }

  public void setCourseSignId(long courseSignId) {
    this.courseSignId = courseSignId;
  }

  public long getCourseId() {
    return courseId;
  }

  public void setCourseId(long courseId) {
    this.courseId = courseId;
  }

  public Date getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(Date beginTime) {
    this.beginTime = beginTime;
  }
}

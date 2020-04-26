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
public class CourseSign implements Serializable {

    private static final long serialVersionUID = 1586522771224L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer SignId;

    /**
    * 
    * isNullAble:1
    */
    private Integer CourseId;

    /**
    * 
    * isNullAble:1
    */
    private Integer StudentId;

    /**
    * 
    * isNullAble:1
    */
    private String SignPlace;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime SignTime;

    /**
    * 
    * isNullAble:1
    */
    private Integer SignStatus;


    public void setSignId(Integer SignId){this.SignId = SignId;}

    public Integer getSignId(){return this.SignId;}

    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setStudentId(Integer StudentId){this.StudentId = StudentId;}

    public Integer getStudentId(){return this.StudentId;}

    public void setSignPlace(String SignPlace){this.SignPlace = SignPlace;}

    public String getSignPlace(){return this.SignPlace;}

    public void setSignTime(java.time.LocalDateTime SignTime){this.SignTime = SignTime;}

    public java.time.LocalDateTime getSignTime(){return this.SignTime;}

    public void setSignStatus(Integer SignStatus){this.SignStatus = SignStatus;}

    public Integer getSignStatus(){return this.SignStatus;}


}

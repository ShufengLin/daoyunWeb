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
public class teachersign implements Serializable {

    private static final long serialVersionUID = 1587105018508L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer TeacherSignId;

    /**
    * 
    * isNullAble:1
    */
    private Integer TeacherId;

    /**
    * 
    * isNullAble:1
    */
    private Integer CourseId;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime Date;


    public void setTeacherSignId(Integer TeacherSignId){this.TeacherSignId = TeacherSignId;}

    public Integer getTeacherSignId(){return this.TeacherSignId;}

    public void setTeacherId(Integer TeacherId){this.TeacherId = TeacherId;}

    public Integer getTeacherId(){return this.TeacherId;}

    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setDate(java.time.LocalDateTime Date){this.Date = Date;}

    public java.time.LocalDateTime getDate(){return this.Date;}

}

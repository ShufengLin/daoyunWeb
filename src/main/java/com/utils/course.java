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
public class course implements Serializable {

    private static final long serialVersionUID = 1586522728755L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer CourseId;

    /**
    * 
    * isNullAble:1
    */
    private String CourseName;

    /**
    * 
    * isNullAble:1
    */
    private Integer CourseHour;

    /**
    * 
    * isNullAble:0
    */
    private Integer TeachId;

    /**
    * 
    * isNullAble:1
    */
    private String CoursePlace;


    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setCourseName(String CourseName){this.CourseName = CourseName;}

    public String getCourseName(){return this.CourseName;}

    public void setCourseHour(Integer CourseHour){this.CourseHour = CourseHour;}

    public Integer getCourseHour(){return this.CourseHour;}

    public void setTeachId(Integer TeachId){this.TeachId = TeachId;}

    public Integer getTeachId(){return this.TeachId;}

    public void setCoursePlace(String CoursePlace){this.CoursePlace = CoursePlace;}

    public String getCoursePlace(){return this.CoursePlace;}
}

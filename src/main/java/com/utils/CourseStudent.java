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
public class CourseStudent implements Serializable {

    private static final long serialVersionUID = 1586522773785L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

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
    private Integer StudentEXP;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setStudentId(Integer StudentId){this.StudentId = StudentId;}

    public Integer getStudentId(){return this.StudentId;}

    public void setStudentEXP(Integer StudentEXP){this.StudentEXP = StudentEXP;}

    public Integer getStudentEXP(){return this.StudentEXP;}

}

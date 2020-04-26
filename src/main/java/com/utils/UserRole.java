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
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1586522787826L;


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
    private Integer UserId;

    /**
    * 
    * isNullAble:1
    */
    private Integer RoleId;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setUserId(Integer UserId){this.UserId = UserId;}

    public Integer getUserId(){return this.UserId;}

    public void setRoleId(Integer RoleId){this.RoleId = RoleId;}

    public Integer getRoleId(){return this.RoleId;}



}

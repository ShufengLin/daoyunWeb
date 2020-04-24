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
public class role implements Serializable {

    private static final long serialVersionUID = 1586522782694L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer RoleId;

    /**
    * 
    * isNullAble:1
    */
    private String RoleName;

    /**
    * 
    * isNullAble:1
    */
    private String RoleDescription;

    /**
    * 
    * isNullAble:1
    */
    private Integer IsLock;

    /**
    * 
    * isNullAble:1
    */
    private String Creator;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime CreationDate;


    public void setRoleId(Integer RoleId){this.RoleId = RoleId;}

    public Integer getRoleId(){return this.RoleId;}

    public void setRoleName(String RoleName){this.RoleName = RoleName;}

    public String getRoleName(){return this.RoleName;}

    public void setRoleDescription(String RoleDescription){this.RoleDescription = RoleDescription;}

    public String getRoleDescription(){return this.RoleDescription;}

    public void setIsLock(Integer IsLock){this.IsLock = IsLock;}

    public Integer getIsLock(){return this.IsLock;}

    public void setCreator(String Creator){this.Creator = Creator;}

    public String getCreator(){return this.Creator;}

    public void setCreationDate(java.time.LocalDateTime CreationDate){this.CreationDate = CreationDate;}

    public java.time.LocalDateTime getCreationDate(){return this.CreationDate;}

}

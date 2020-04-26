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
public class permision implements Serializable {

    private static final long serialVersionUID = 1586522780666L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer PermissionId;

    /**
    * 
    * isNullAble:1
    */
    private Integer MenuId;

    /**
    * 
    * isNullAble:1
    */
    private String PermissionName;

    /**
    * 
    * isNullAble:1
    */
    private String PermissionDescription;

    /**
    * 
    * isNullAble:1
    */
    private Integer ParentId;


    public void setPermissionId(Integer PermissionId){this.PermissionId = PermissionId;}

    public Integer getPermissionId(){return this.PermissionId;}

    public void setMenuId(Integer MenuId){this.MenuId = MenuId;}

    public Integer getMenuId(){return this.MenuId;}

    public void setPermissionName(String PermissionName){this.PermissionName = PermissionName;}

    public String getPermissionName(){return this.PermissionName;}

    public void setPermissionDescription(String PermissionDescription){this.PermissionDescription = PermissionDescription;}

    public String getPermissionDescription(){return this.PermissionDescription;}

    public void setParentId(Integer ParentId){this.ParentId = ParentId;}

    public Integer getParentId(){return this.ParentId;}
}

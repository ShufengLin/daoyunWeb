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
public class menu implements Serializable {

    private static final long serialVersionUID = 1586522778984L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer MenuId;

    /**
    * 
    * isNullAble:1
    */
    private String MenuName;

    /**
    * 
    * isNullAble:1
    */
    private String MenuURL;

    /**
    * 
    * isNullAble:1
    */
    private String MenuIcon;


    public void setMenuId(Integer MenuId){this.MenuId = MenuId;}

    public Integer getMenuId(){return this.MenuId;}

    public void setMenuName(String MenuName){this.MenuName = MenuName;}

    public String getMenuName(){return this.MenuName;}

    public void setMenuURL(String MenuURL){this.MenuURL = MenuURL;}

    public String getMenuURL(){return this.MenuURL;}

    public void setMenuIcon(String MenuIcon){this.MenuIcon = MenuIcon;}

    public String getMenuIcon(){return this.MenuIcon;}

}

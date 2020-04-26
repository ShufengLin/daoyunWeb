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
public class roledescription implements Serializable {

    private static final long serialVersionUID = 1586522784341L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer RolePermisionId;

    /**
    * 
    * isNullAble:1
    */
    private Integer RoleId;

    /**
    * 
    * isNullAble:1
    */
    private Integer RightId;


    public void setRolePermisionId(Integer RolePermisionId){this.RolePermisionId = RolePermisionId;}

    public Integer getRolePermisionId(){return this.RolePermisionId;}

    public void setRoleId(Integer RoleId){this.RoleId = RoleId;}

    public Integer getRoleId(){return this.RoleId;}

    public void setRightId(Integer RightId){this.RightId = RightId;}

    public Integer getRightId(){return this.RightId;}

}

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
public class dictionary implements Serializable {

    private static final long serialVersionUID = 1586522775697L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer DicId;

    /**
    * 
    * isNullAble:1
    */
    private String DicName;

    /**
    * 
    * isNullAble:1
    */
    private String DicDescription;

    /**
    * 
    * isNullAble:1
    */
    private String Code;


    public void setDicId(Integer DicId){this.DicId = DicId;}

    public Integer getDicId(){return this.DicId;}

    public void setDicName(String DicName){this.DicName = DicName;}

    public String getDicName(){return this.DicName;}

    public void setDicDescription(String DicDescription){this.DicDescription = DicDescription;}

    public String getDicDescription(){return this.DicDescription;}

    public void setCode(String Code){this.Code = Code;}

    public String getCode(){return this.Code;}
}


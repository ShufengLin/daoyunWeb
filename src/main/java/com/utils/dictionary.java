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
    private Integer dicId;


    /**
    * 
    * isNullAble:1
    */
    private String dicName;

    /**
    * 
    * isNullAble:1
    */
    private String dicDescription;

    /**
    * 
    * isNullAble:1
    */
    private String dicCode;

    public Integer getDicId() {
        return dicId;
    }

    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }

    public String getDicDescription() {
        return dicDescription;
    }

    public void setDicDescription(String dicDescription) {
        this.dicDescription = dicDescription;
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

//    public Integer getDic_Id() {
//        return dic_Id;
//    }
//
//    public void setDic_Id(Integer dic_Id) {
//        this.dic_Id = dic_Id;
//    }
//    public String getDic_Name() {
//        return dic_Name;
//    }
//
//    public void setDic_Name(String dic_Name) {
//        this.dic_Name = dic_Name;
//    }
//
//    public String getDic_Description() {
//        return dic_Description;
//    }
//
//    public void setDic_Description(String dic_Description) {
//        this.dic_Description = dic_Description;
//    }
//
//    public String getDic_code() {
//        return dic_code;
//    }
//
//    public void setDic_code(String dic_code) {
//        this.dic_code = dic_code;
//    }

//    public Integer getDicId(){return DicId;}
//
//    public void setDicId(Integer DicId){this.DicId = DicId;}

//    public void setDicName(String DicName){this.DicName = DicName;}
//
//    public String getDicName(){return this.DicName;}
//
//    public void setDicDescription(String DicDescription){this.DicDescription = DicDescription;}
//
//    public String getDicDescription(){return this.DicDescription;}
//
//    public void setCode(String Code){this.Code = Code;}
//
//    public String getCode(){return this.Code;}
}


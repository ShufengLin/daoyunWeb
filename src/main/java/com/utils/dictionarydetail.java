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
public class dictionarydetail implements Serializable {

    private static final long serialVersionUID = 1586522777279L;


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
    private Integer DicId;

    /**
    * 
    * isNullAble:1
    */
    private Integer ItemKey;

    /**
    * 
    * isNullAble:1
    */
    private String ItemValue;

    /**
    * 
    * isNullAble:1
    */
    private Integer IsDefault;

    /**
    * 
    * isNullAble:1
    */
    private String Code;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setDicId(Integer DicId){this.DicId = DicId;}

    public Integer getDicId(){return this.DicId;}

    public void setItemKey(Integer ItemKey){this.ItemKey = ItemKey;}

    public Integer getItemKey(){return this.ItemKey;}

    public void setItemValue(String ItemValue){this.ItemValue = ItemValue;}

    public String getItemValue(){return this.ItemValue;}

    public void setIsDefault(Integer IsDefault){this.IsDefault = IsDefault;}

    public Integer getIsDefault(){return this.IsDefault;}

    public void setCode(String Code){this.Code = Code;}

    public String getCode(){return this.Code;}

}

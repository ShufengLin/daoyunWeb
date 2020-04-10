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
    @Override
    public String toString() {
        return "dictionarydetail{" +
                "Id='" + Id + '\'' +
                "DicId='" + DicId + '\'' +
                "ItemKey='" + ItemKey + '\'' +
                "ItemValue='" + ItemValue + '\'' +
                "IsDefault='" + IsDefault + '\'' +
                "Code='" + Code + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private dictionarydetail set;

        private ConditionBuilder where;

        public UpdateBuilder set(dictionarydetail set){
            this.set = set;
            return this;
        }

        public dictionarydetail getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends dictionarydetail{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<Integer> DicIdList;

        public List<Integer> getDicIdList(){return this.DicIdList;}

        private Integer DicIdSt;

        private Integer DicIdEd;

        public Integer getDicIdSt(){return this.DicIdSt;}

        public Integer getDicIdEd(){return this.DicIdEd;}

        private List<Integer> ItemKeyList;

        public List<Integer> getItemKeyList(){return this.ItemKeyList;}

        private Integer ItemKeySt;

        private Integer ItemKeyEd;

        public Integer getItemKeySt(){return this.ItemKeySt;}

        public Integer getItemKeyEd(){return this.ItemKeyEd;}

        private List<String> ItemValueList;

        public List<String> getItemValueList(){return this.ItemValueList;}


        private List<String> fuzzyItemValue;

        public List<String> getFuzzyItemValue(){return this.fuzzyItemValue;}

        private List<String> rightFuzzyItemValue;

        public List<String> getRightFuzzyItemValue(){return this.rightFuzzyItemValue;}
        private List<Integer> IsDefaultList;

        public List<Integer> getIsDefaultList(){return this.IsDefaultList;}

        private Integer IsDefaultSt;

        private Integer IsDefaultEd;

        public Integer getIsDefaultSt(){return this.IsDefaultSt;}

        public Integer getIsDefaultEd(){return this.IsDefaultEd;}

        private List<String> CodeList;

        public List<String> getCodeList(){return this.CodeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder IdBetWeen(Integer IdSt,Integer IdEd){
            this.IdSt = IdSt;
            this.IdEd = IdEd;
            return this;
        }

        public QueryBuilder IdGreaterEqThan(Integer IdSt){
            this.IdSt = IdSt;
            return this;
        }
        public QueryBuilder IdLessEqThan(Integer IdEd){
            this.IdEd = IdEd;
            return this;
        }


        public QueryBuilder Id(Integer Id){
            setId(Id);
            return this;
        }

        public QueryBuilder IdList(Integer ... Id){
            this.IdList = solveNullList(Id);
            return this;
        }

        public QueryBuilder IdList(List<Integer> Id){
            this.IdList = Id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","Id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","Id");
            return this;
        }

        public QueryBuilder DicIdBetWeen(Integer DicIdSt,Integer DicIdEd){
            this.DicIdSt = DicIdSt;
            this.DicIdEd = DicIdEd;
            return this;
        }

        public QueryBuilder DicIdGreaterEqThan(Integer DicIdSt){
            this.DicIdSt = DicIdSt;
            return this;
        }
        public QueryBuilder DicIdLessEqThan(Integer DicIdEd){
            this.DicIdEd = DicIdEd;
            return this;
        }


        public QueryBuilder DicId(Integer DicId){
            setDicId(DicId);
            return this;
        }

        public QueryBuilder DicIdList(Integer ... DicId){
            this.DicIdList = solveNullList(DicId);
            return this;
        }

        public QueryBuilder DicIdList(List<Integer> DicId){
            this.DicIdList = DicId;
            return this;
        }

        public QueryBuilder fetchDicId(){
            setFetchFields("fetchFields","DicId");
            return this;
        }

        public QueryBuilder excludeDicId(){
            setFetchFields("excludeFields","DicId");
            return this;
        }

        public QueryBuilder ItemKeyBetWeen(Integer ItemKeySt,Integer ItemKeyEd){
            this.ItemKeySt = ItemKeySt;
            this.ItemKeyEd = ItemKeyEd;
            return this;
        }

        public QueryBuilder ItemKeyGreaterEqThan(Integer ItemKeySt){
            this.ItemKeySt = ItemKeySt;
            return this;
        }
        public QueryBuilder ItemKeyLessEqThan(Integer ItemKeyEd){
            this.ItemKeyEd = ItemKeyEd;
            return this;
        }


        public QueryBuilder ItemKey(Integer ItemKey){
            setItemKey(ItemKey);
            return this;
        }

        public QueryBuilder ItemKeyList(Integer ... ItemKey){
            this.ItemKeyList = solveNullList(ItemKey);
            return this;
        }

        public QueryBuilder ItemKeyList(List<Integer> ItemKey){
            this.ItemKeyList = ItemKey;
            return this;
        }

        public QueryBuilder fetchItemKey(){
            setFetchFields("fetchFields","ItemKey");
            return this;
        }

        public QueryBuilder excludeItemKey(){
            setFetchFields("excludeFields","ItemKey");
            return this;
        }

        public QueryBuilder fuzzyItemValue (List<String> fuzzyItemValue){
            this.fuzzyItemValue = fuzzyItemValue;
            return this;
        }

        public QueryBuilder fuzzyItemValue (String ... fuzzyItemValue){
            this.fuzzyItemValue = solveNullList(fuzzyItemValue);
            return this;
        }

        public QueryBuilder rightFuzzyItemValue (List<String> rightFuzzyItemValue){
            this.rightFuzzyItemValue = rightFuzzyItemValue;
            return this;
        }

        public QueryBuilder rightFuzzyItemValue (String ... rightFuzzyItemValue){
            this.rightFuzzyItemValue = solveNullList(rightFuzzyItemValue);
            return this;
        }

        public QueryBuilder ItemValue(String ItemValue){
            setItemValue(ItemValue);
            return this;
        }

        public QueryBuilder ItemValueList(String ... ItemValue){
            this.ItemValueList = solveNullList(ItemValue);
            return this;
        }

        public QueryBuilder ItemValueList(List<String> ItemValue){
            this.ItemValueList = ItemValue;
            return this;
        }

        public QueryBuilder fetchItemValue(){
            setFetchFields("fetchFields","ItemValue");
            return this;
        }

        public QueryBuilder excludeItemValue(){
            setFetchFields("excludeFields","ItemValue");
            return this;
        }

        public QueryBuilder IsDefaultBetWeen(Integer IsDefaultSt,Integer IsDefaultEd){
            this.IsDefaultSt = IsDefaultSt;
            this.IsDefaultEd = IsDefaultEd;
            return this;
        }

        public QueryBuilder IsDefaultGreaterEqThan(Integer IsDefaultSt){
            this.IsDefaultSt = IsDefaultSt;
            return this;
        }
        public QueryBuilder IsDefaultLessEqThan(Integer IsDefaultEd){
            this.IsDefaultEd = IsDefaultEd;
            return this;
        }


        public QueryBuilder IsDefault(Integer IsDefault){
            setIsDefault(IsDefault);
            return this;
        }

        public QueryBuilder IsDefaultList(Integer ... IsDefault){
            this.IsDefaultList = solveNullList(IsDefault);
            return this;
        }

        public QueryBuilder IsDefaultList(List<Integer> IsDefault){
            this.IsDefaultList = IsDefault;
            return this;
        }

        public QueryBuilder fetchIsDefault(){
            setFetchFields("fetchFields","IsDefault");
            return this;
        }

        public QueryBuilder excludeIsDefault(){
            setFetchFields("excludeFields","IsDefault");
            return this;
        }

        public QueryBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public QueryBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public QueryBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public QueryBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public QueryBuilder Code(String Code){
            setCode(Code);
            return this;
        }

        public QueryBuilder CodeList(String ... Code){
            this.CodeList = solveNullList(Code);
            return this;
        }

        public QueryBuilder CodeList(List<String> Code){
            this.CodeList = Code;
            return this;
        }

        public QueryBuilder fetchCode(){
            setFetchFields("fetchFields","Code");
            return this;
        }

        public QueryBuilder excludeCode(){
            setFetchFields("excludeFields","Code");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public dictionarydetail build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<Integer> DicIdList;

        public List<Integer> getDicIdList(){return this.DicIdList;}

        private Integer DicIdSt;

        private Integer DicIdEd;

        public Integer getDicIdSt(){return this.DicIdSt;}

        public Integer getDicIdEd(){return this.DicIdEd;}

        private List<Integer> ItemKeyList;

        public List<Integer> getItemKeyList(){return this.ItemKeyList;}

        private Integer ItemKeySt;

        private Integer ItemKeyEd;

        public Integer getItemKeySt(){return this.ItemKeySt;}

        public Integer getItemKeyEd(){return this.ItemKeyEd;}

        private List<String> ItemValueList;

        public List<String> getItemValueList(){return this.ItemValueList;}


        private List<String> fuzzyItemValue;

        public List<String> getFuzzyItemValue(){return this.fuzzyItemValue;}

        private List<String> rightFuzzyItemValue;

        public List<String> getRightFuzzyItemValue(){return this.rightFuzzyItemValue;}
        private List<Integer> IsDefaultList;

        public List<Integer> getIsDefaultList(){return this.IsDefaultList;}

        private Integer IsDefaultSt;

        private Integer IsDefaultEd;

        public Integer getIsDefaultSt(){return this.IsDefaultSt;}

        public Integer getIsDefaultEd(){return this.IsDefaultEd;}

        private List<String> CodeList;

        public List<String> getCodeList(){return this.CodeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}

        public ConditionBuilder IdBetWeen(Integer IdSt,Integer IdEd){
            this.IdSt = IdSt;
            this.IdEd = IdEd;
            return this;
        }

        public ConditionBuilder IdGreaterEqThan(Integer IdSt){
            this.IdSt = IdSt;
            return this;
        }
        public ConditionBuilder IdLessEqThan(Integer IdEd){
            this.IdEd = IdEd;
            return this;
        }


        public ConditionBuilder IdList(Integer ... Id){
            this.IdList = solveNullList(Id);
            return this;
        }

        public ConditionBuilder IdList(List<Integer> Id){
            this.IdList = Id;
            return this;
        }

        public ConditionBuilder DicIdBetWeen(Integer DicIdSt,Integer DicIdEd){
            this.DicIdSt = DicIdSt;
            this.DicIdEd = DicIdEd;
            return this;
        }

        public ConditionBuilder DicIdGreaterEqThan(Integer DicIdSt){
            this.DicIdSt = DicIdSt;
            return this;
        }
        public ConditionBuilder DicIdLessEqThan(Integer DicIdEd){
            this.DicIdEd = DicIdEd;
            return this;
        }


        public ConditionBuilder DicIdList(Integer ... DicId){
            this.DicIdList = solveNullList(DicId);
            return this;
        }

        public ConditionBuilder DicIdList(List<Integer> DicId){
            this.DicIdList = DicId;
            return this;
        }

        public ConditionBuilder ItemKeyBetWeen(Integer ItemKeySt,Integer ItemKeyEd){
            this.ItemKeySt = ItemKeySt;
            this.ItemKeyEd = ItemKeyEd;
            return this;
        }

        public ConditionBuilder ItemKeyGreaterEqThan(Integer ItemKeySt){
            this.ItemKeySt = ItemKeySt;
            return this;
        }
        public ConditionBuilder ItemKeyLessEqThan(Integer ItemKeyEd){
            this.ItemKeyEd = ItemKeyEd;
            return this;
        }


        public ConditionBuilder ItemKeyList(Integer ... ItemKey){
            this.ItemKeyList = solveNullList(ItemKey);
            return this;
        }

        public ConditionBuilder ItemKeyList(List<Integer> ItemKey){
            this.ItemKeyList = ItemKey;
            return this;
        }

        public ConditionBuilder fuzzyItemValue (List<String> fuzzyItemValue){
            this.fuzzyItemValue = fuzzyItemValue;
            return this;
        }

        public ConditionBuilder fuzzyItemValue (String ... fuzzyItemValue){
            this.fuzzyItemValue = solveNullList(fuzzyItemValue);
            return this;
        }

        public ConditionBuilder rightFuzzyItemValue (List<String> rightFuzzyItemValue){
            this.rightFuzzyItemValue = rightFuzzyItemValue;
            return this;
        }

        public ConditionBuilder rightFuzzyItemValue (String ... rightFuzzyItemValue){
            this.rightFuzzyItemValue = solveNullList(rightFuzzyItemValue);
            return this;
        }

        public ConditionBuilder ItemValueList(String ... ItemValue){
            this.ItemValueList = solveNullList(ItemValue);
            return this;
        }

        public ConditionBuilder ItemValueList(List<String> ItemValue){
            this.ItemValueList = ItemValue;
            return this;
        }

        public ConditionBuilder IsDefaultBetWeen(Integer IsDefaultSt,Integer IsDefaultEd){
            this.IsDefaultSt = IsDefaultSt;
            this.IsDefaultEd = IsDefaultEd;
            return this;
        }

        public ConditionBuilder IsDefaultGreaterEqThan(Integer IsDefaultSt){
            this.IsDefaultSt = IsDefaultSt;
            return this;
        }
        public ConditionBuilder IsDefaultLessEqThan(Integer IsDefaultEd){
            this.IsDefaultEd = IsDefaultEd;
            return this;
        }


        public ConditionBuilder IsDefaultList(Integer ... IsDefault){
            this.IsDefaultList = solveNullList(IsDefault);
            return this;
        }

        public ConditionBuilder IsDefaultList(List<Integer> IsDefault){
            this.IsDefaultList = IsDefault;
            return this;
        }

        public ConditionBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public ConditionBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public ConditionBuilder CodeList(String ... Code){
            this.CodeList = solveNullList(Code);
            return this;
        }

        public ConditionBuilder CodeList(List<String> Code){
            this.CodeList = Code;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private dictionarydetail obj;

        public Builder(){
            this.obj = new dictionarydetail();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder DicId(Integer DicId){
            this.obj.setDicId(DicId);
            return this;
        }
        public Builder ItemKey(Integer ItemKey){
            this.obj.setItemKey(ItemKey);
            return this;
        }
        public Builder ItemValue(String ItemValue){
            this.obj.setItemValue(ItemValue);
            return this;
        }
        public Builder IsDefault(Integer IsDefault){
            this.obj.setIsDefault(IsDefault);
            return this;
        }
        public Builder Code(String Code){
            this.obj.setCode(Code);
            return this;
        }
        public dictionarydetail build(){return obj;}
    }

}

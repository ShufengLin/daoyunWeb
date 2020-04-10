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
    @Override
    public String toString() {
        return "dictionary{" +
                "DicId='" + DicId + '\'' +
                "DicName='" + DicName + '\'' +
                "DicDescription='" + DicDescription + '\'' +
                "Code='" + Code + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private dictionary set;

        private ConditionBuilder where;

        public UpdateBuilder set(dictionary set){
            this.set = set;
            return this;
        }

        public dictionary getSet(){
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

    public static class QueryBuilder extends dictionary{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> DicIdList;

        public List<Integer> getDicIdList(){return this.DicIdList;}

        private Integer DicIdSt;

        private Integer DicIdEd;

        public Integer getDicIdSt(){return this.DicIdSt;}

        public Integer getDicIdEd(){return this.DicIdEd;}

        private List<String> DicNameList;

        public List<String> getDicNameList(){return this.DicNameList;}


        private List<String> fuzzyDicName;

        public List<String> getFuzzyDicName(){return this.fuzzyDicName;}

        private List<String> rightFuzzyDicName;

        public List<String> getRightFuzzyDicName(){return this.rightFuzzyDicName;}
        private List<String> DicDescriptionList;

        public List<String> getDicDescriptionList(){return this.DicDescriptionList;}


        private List<String> fuzzyDicDescription;

        public List<String> getFuzzyDicDescription(){return this.fuzzyDicDescription;}

        private List<String> rightFuzzyDicDescription;

        public List<String> getRightFuzzyDicDescription(){return this.rightFuzzyDicDescription;}
        private List<String> CodeList;

        public List<String> getCodeList(){return this.CodeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyDicName (List<String> fuzzyDicName){
            this.fuzzyDicName = fuzzyDicName;
            return this;
        }

        public QueryBuilder fuzzyDicName (String ... fuzzyDicName){
            this.fuzzyDicName = solveNullList(fuzzyDicName);
            return this;
        }

        public QueryBuilder rightFuzzyDicName (List<String> rightFuzzyDicName){
            this.rightFuzzyDicName = rightFuzzyDicName;
            return this;
        }

        public QueryBuilder rightFuzzyDicName (String ... rightFuzzyDicName){
            this.rightFuzzyDicName = solveNullList(rightFuzzyDicName);
            return this;
        }

        public QueryBuilder DicName(String DicName){
            setDicName(DicName);
            return this;
        }

        public QueryBuilder DicNameList(String ... DicName){
            this.DicNameList = solveNullList(DicName);
            return this;
        }

        public QueryBuilder DicNameList(List<String> DicName){
            this.DicNameList = DicName;
            return this;
        }

        public QueryBuilder fetchDicName(){
            setFetchFields("fetchFields","DicName");
            return this;
        }

        public QueryBuilder excludeDicName(){
            setFetchFields("excludeFields","DicName");
            return this;
        }

        public QueryBuilder fuzzyDicDescription (List<String> fuzzyDicDescription){
            this.fuzzyDicDescription = fuzzyDicDescription;
            return this;
        }

        public QueryBuilder fuzzyDicDescription (String ... fuzzyDicDescription){
            this.fuzzyDicDescription = solveNullList(fuzzyDicDescription);
            return this;
        }

        public QueryBuilder rightFuzzyDicDescription (List<String> rightFuzzyDicDescription){
            this.rightFuzzyDicDescription = rightFuzzyDicDescription;
            return this;
        }

        public QueryBuilder rightFuzzyDicDescription (String ... rightFuzzyDicDescription){
            this.rightFuzzyDicDescription = solveNullList(rightFuzzyDicDescription);
            return this;
        }

        public QueryBuilder DicDescription(String DicDescription){
            setDicDescription(DicDescription);
            return this;
        }

        public QueryBuilder DicDescriptionList(String ... DicDescription){
            this.DicDescriptionList = solveNullList(DicDescription);
            return this;
        }

        public QueryBuilder DicDescriptionList(List<String> DicDescription){
            this.DicDescriptionList = DicDescription;
            return this;
        }

        public QueryBuilder fetchDicDescription(){
            setFetchFields("fetchFields","DicDescription");
            return this;
        }

        public QueryBuilder excludeDicDescription(){
            setFetchFields("excludeFields","DicDescription");
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

        public dictionary build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> DicIdList;

        public List<Integer> getDicIdList(){return this.DicIdList;}

        private Integer DicIdSt;

        private Integer DicIdEd;

        public Integer getDicIdSt(){return this.DicIdSt;}

        public Integer getDicIdEd(){return this.DicIdEd;}

        private List<String> DicNameList;

        public List<String> getDicNameList(){return this.DicNameList;}


        private List<String> fuzzyDicName;

        public List<String> getFuzzyDicName(){return this.fuzzyDicName;}

        private List<String> rightFuzzyDicName;

        public List<String> getRightFuzzyDicName(){return this.rightFuzzyDicName;}
        private List<String> DicDescriptionList;

        public List<String> getDicDescriptionList(){return this.DicDescriptionList;}


        private List<String> fuzzyDicDescription;

        public List<String> getFuzzyDicDescription(){return this.fuzzyDicDescription;}

        private List<String> rightFuzzyDicDescription;

        public List<String> getRightFuzzyDicDescription(){return this.rightFuzzyDicDescription;}
        private List<String> CodeList;

        public List<String> getCodeList(){return this.CodeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}

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

        public ConditionBuilder fuzzyDicName (List<String> fuzzyDicName){
            this.fuzzyDicName = fuzzyDicName;
            return this;
        }

        public ConditionBuilder fuzzyDicName (String ... fuzzyDicName){
            this.fuzzyDicName = solveNullList(fuzzyDicName);
            return this;
        }

        public ConditionBuilder rightFuzzyDicName (List<String> rightFuzzyDicName){
            this.rightFuzzyDicName = rightFuzzyDicName;
            return this;
        }

        public ConditionBuilder rightFuzzyDicName (String ... rightFuzzyDicName){
            this.rightFuzzyDicName = solveNullList(rightFuzzyDicName);
            return this;
        }

        public ConditionBuilder DicNameList(String ... DicName){
            this.DicNameList = solveNullList(DicName);
            return this;
        }

        public ConditionBuilder DicNameList(List<String> DicName){
            this.DicNameList = DicName;
            return this;
        }

        public ConditionBuilder fuzzyDicDescription (List<String> fuzzyDicDescription){
            this.fuzzyDicDescription = fuzzyDicDescription;
            return this;
        }

        public ConditionBuilder fuzzyDicDescription (String ... fuzzyDicDescription){
            this.fuzzyDicDescription = solveNullList(fuzzyDicDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyDicDescription (List<String> rightFuzzyDicDescription){
            this.rightFuzzyDicDescription = rightFuzzyDicDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyDicDescription (String ... rightFuzzyDicDescription){
            this.rightFuzzyDicDescription = solveNullList(rightFuzzyDicDescription);
            return this;
        }

        public ConditionBuilder DicDescriptionList(String ... DicDescription){
            this.DicDescriptionList = solveNullList(DicDescription);
            return this;
        }

        public ConditionBuilder DicDescriptionList(List<String> DicDescription){
            this.DicDescriptionList = DicDescription;
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

        private dictionary obj;

        public Builder(){
            this.obj = new dictionary();
        }

        public Builder DicId(Integer DicId){
            this.obj.setDicId(DicId);
            return this;
        }
        public Builder DicName(String DicName){
            this.obj.setDicName(DicName);
            return this;
        }
        public Builder DicDescription(String DicDescription){
            this.obj.setDicDescription(DicDescription);
            return this;
        }
        public Builder Code(String Code){
            this.obj.setCode(Code);
            return this;
        }
        public dictionary build(){return obj;}
    }

}

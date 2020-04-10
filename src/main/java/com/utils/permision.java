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
    @Override
    public String toString() {
        return "permision{" +
                "PermissionId='" + PermissionId + '\'' +
                "MenuId='" + MenuId + '\'' +
                "PermissionName='" + PermissionName + '\'' +
                "PermissionDescription='" + PermissionDescription + '\'' +
                "ParentId='" + ParentId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private permision set;

        private ConditionBuilder where;

        public UpdateBuilder set(permision set){
            this.set = set;
            return this;
        }

        public permision getSet(){
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

    public static class QueryBuilder extends permision{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> PermissionIdList;

        public List<Integer> getPermissionIdList(){return this.PermissionIdList;}

        private Integer PermissionIdSt;

        private Integer PermissionIdEd;

        public Integer getPermissionIdSt(){return this.PermissionIdSt;}

        public Integer getPermissionIdEd(){return this.PermissionIdEd;}

        private List<Integer> MenuIdList;

        public List<Integer> getMenuIdList(){return this.MenuIdList;}

        private Integer MenuIdSt;

        private Integer MenuIdEd;

        public Integer getMenuIdSt(){return this.MenuIdSt;}

        public Integer getMenuIdEd(){return this.MenuIdEd;}

        private List<String> PermissionNameList;

        public List<String> getPermissionNameList(){return this.PermissionNameList;}


        private List<String> fuzzyPermissionName;

        public List<String> getFuzzyPermissionName(){return this.fuzzyPermissionName;}

        private List<String> rightFuzzyPermissionName;

        public List<String> getRightFuzzyPermissionName(){return this.rightFuzzyPermissionName;}
        private List<String> PermissionDescriptionList;

        public List<String> getPermissionDescriptionList(){return this.PermissionDescriptionList;}


        private List<String> fuzzyPermissionDescription;

        public List<String> getFuzzyPermissionDescription(){return this.fuzzyPermissionDescription;}

        private List<String> rightFuzzyPermissionDescription;

        public List<String> getRightFuzzyPermissionDescription(){return this.rightFuzzyPermissionDescription;}
        private List<Integer> ParentIdList;

        public List<Integer> getParentIdList(){return this.ParentIdList;}

        private Integer ParentIdSt;

        private Integer ParentIdEd;

        public Integer getParentIdSt(){return this.ParentIdSt;}

        public Integer getParentIdEd(){return this.ParentIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder PermissionIdBetWeen(Integer PermissionIdSt,Integer PermissionIdEd){
            this.PermissionIdSt = PermissionIdSt;
            this.PermissionIdEd = PermissionIdEd;
            return this;
        }

        public QueryBuilder PermissionIdGreaterEqThan(Integer PermissionIdSt){
            this.PermissionIdSt = PermissionIdSt;
            return this;
        }
        public QueryBuilder PermissionIdLessEqThan(Integer PermissionIdEd){
            this.PermissionIdEd = PermissionIdEd;
            return this;
        }


        public QueryBuilder PermissionId(Integer PermissionId){
            setPermissionId(PermissionId);
            return this;
        }

        public QueryBuilder PermissionIdList(Integer ... PermissionId){
            this.PermissionIdList = solveNullList(PermissionId);
            return this;
        }

        public QueryBuilder PermissionIdList(List<Integer> PermissionId){
            this.PermissionIdList = PermissionId;
            return this;
        }

        public QueryBuilder fetchPermissionId(){
            setFetchFields("fetchFields","PermissionId");
            return this;
        }

        public QueryBuilder excludePermissionId(){
            setFetchFields("excludeFields","PermissionId");
            return this;
        }

        public QueryBuilder MenuIdBetWeen(Integer MenuIdSt,Integer MenuIdEd){
            this.MenuIdSt = MenuIdSt;
            this.MenuIdEd = MenuIdEd;
            return this;
        }

        public QueryBuilder MenuIdGreaterEqThan(Integer MenuIdSt){
            this.MenuIdSt = MenuIdSt;
            return this;
        }
        public QueryBuilder MenuIdLessEqThan(Integer MenuIdEd){
            this.MenuIdEd = MenuIdEd;
            return this;
        }


        public QueryBuilder MenuId(Integer MenuId){
            setMenuId(MenuId);
            return this;
        }

        public QueryBuilder MenuIdList(Integer ... MenuId){
            this.MenuIdList = solveNullList(MenuId);
            return this;
        }

        public QueryBuilder MenuIdList(List<Integer> MenuId){
            this.MenuIdList = MenuId;
            return this;
        }

        public QueryBuilder fetchMenuId(){
            setFetchFields("fetchFields","MenuId");
            return this;
        }

        public QueryBuilder excludeMenuId(){
            setFetchFields("excludeFields","MenuId");
            return this;
        }

        public QueryBuilder fuzzyPermissionName (List<String> fuzzyPermissionName){
            this.fuzzyPermissionName = fuzzyPermissionName;
            return this;
        }

        public QueryBuilder fuzzyPermissionName (String ... fuzzyPermissionName){
            this.fuzzyPermissionName = solveNullList(fuzzyPermissionName);
            return this;
        }

        public QueryBuilder rightFuzzyPermissionName (List<String> rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = rightFuzzyPermissionName;
            return this;
        }

        public QueryBuilder rightFuzzyPermissionName (String ... rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = solveNullList(rightFuzzyPermissionName);
            return this;
        }

        public QueryBuilder PermissionName(String PermissionName){
            setPermissionName(PermissionName);
            return this;
        }

        public QueryBuilder PermissionNameList(String ... PermissionName){
            this.PermissionNameList = solveNullList(PermissionName);
            return this;
        }

        public QueryBuilder PermissionNameList(List<String> PermissionName){
            this.PermissionNameList = PermissionName;
            return this;
        }

        public QueryBuilder fetchPermissionName(){
            setFetchFields("fetchFields","PermissionName");
            return this;
        }

        public QueryBuilder excludePermissionName(){
            setFetchFields("excludeFields","PermissionName");
            return this;
        }

        public QueryBuilder fuzzyPermissionDescription (List<String> fuzzyPermissionDescription){
            this.fuzzyPermissionDescription = fuzzyPermissionDescription;
            return this;
        }

        public QueryBuilder fuzzyPermissionDescription (String ... fuzzyPermissionDescription){
            this.fuzzyPermissionDescription = solveNullList(fuzzyPermissionDescription);
            return this;
        }

        public QueryBuilder rightFuzzyPermissionDescription (List<String> rightFuzzyPermissionDescription){
            this.rightFuzzyPermissionDescription = rightFuzzyPermissionDescription;
            return this;
        }

        public QueryBuilder rightFuzzyPermissionDescription (String ... rightFuzzyPermissionDescription){
            this.rightFuzzyPermissionDescription = solveNullList(rightFuzzyPermissionDescription);
            return this;
        }

        public QueryBuilder PermissionDescription(String PermissionDescription){
            setPermissionDescription(PermissionDescription);
            return this;
        }

        public QueryBuilder PermissionDescriptionList(String ... PermissionDescription){
            this.PermissionDescriptionList = solveNullList(PermissionDescription);
            return this;
        }

        public QueryBuilder PermissionDescriptionList(List<String> PermissionDescription){
            this.PermissionDescriptionList = PermissionDescription;
            return this;
        }

        public QueryBuilder fetchPermissionDescription(){
            setFetchFields("fetchFields","PermissionDescription");
            return this;
        }

        public QueryBuilder excludePermissionDescription(){
            setFetchFields("excludeFields","PermissionDescription");
            return this;
        }

        public QueryBuilder ParentIdBetWeen(Integer ParentIdSt,Integer ParentIdEd){
            this.ParentIdSt = ParentIdSt;
            this.ParentIdEd = ParentIdEd;
            return this;
        }

        public QueryBuilder ParentIdGreaterEqThan(Integer ParentIdSt){
            this.ParentIdSt = ParentIdSt;
            return this;
        }
        public QueryBuilder ParentIdLessEqThan(Integer ParentIdEd){
            this.ParentIdEd = ParentIdEd;
            return this;
        }


        public QueryBuilder ParentId(Integer ParentId){
            setParentId(ParentId);
            return this;
        }

        public QueryBuilder ParentIdList(Integer ... ParentId){
            this.ParentIdList = solveNullList(ParentId);
            return this;
        }

        public QueryBuilder ParentIdList(List<Integer> ParentId){
            this.ParentIdList = ParentId;
            return this;
        }

        public QueryBuilder fetchParentId(){
            setFetchFields("fetchFields","ParentId");
            return this;
        }

        public QueryBuilder excludeParentId(){
            setFetchFields("excludeFields","ParentId");
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

        public permision build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> PermissionIdList;

        public List<Integer> getPermissionIdList(){return this.PermissionIdList;}

        private Integer PermissionIdSt;

        private Integer PermissionIdEd;

        public Integer getPermissionIdSt(){return this.PermissionIdSt;}

        public Integer getPermissionIdEd(){return this.PermissionIdEd;}

        private List<Integer> MenuIdList;

        public List<Integer> getMenuIdList(){return this.MenuIdList;}

        private Integer MenuIdSt;

        private Integer MenuIdEd;

        public Integer getMenuIdSt(){return this.MenuIdSt;}

        public Integer getMenuIdEd(){return this.MenuIdEd;}

        private List<String> PermissionNameList;

        public List<String> getPermissionNameList(){return this.PermissionNameList;}


        private List<String> fuzzyPermissionName;

        public List<String> getFuzzyPermissionName(){return this.fuzzyPermissionName;}

        private List<String> rightFuzzyPermissionName;

        public List<String> getRightFuzzyPermissionName(){return this.rightFuzzyPermissionName;}
        private List<String> PermissionDescriptionList;

        public List<String> getPermissionDescriptionList(){return this.PermissionDescriptionList;}


        private List<String> fuzzyPermissionDescription;

        public List<String> getFuzzyPermissionDescription(){return this.fuzzyPermissionDescription;}

        private List<String> rightFuzzyPermissionDescription;

        public List<String> getRightFuzzyPermissionDescription(){return this.rightFuzzyPermissionDescription;}
        private List<Integer> ParentIdList;

        public List<Integer> getParentIdList(){return this.ParentIdList;}

        private Integer ParentIdSt;

        private Integer ParentIdEd;

        public Integer getParentIdSt(){return this.ParentIdSt;}

        public Integer getParentIdEd(){return this.ParentIdEd;}


        public ConditionBuilder PermissionIdBetWeen(Integer PermissionIdSt,Integer PermissionIdEd){
            this.PermissionIdSt = PermissionIdSt;
            this.PermissionIdEd = PermissionIdEd;
            return this;
        }

        public ConditionBuilder PermissionIdGreaterEqThan(Integer PermissionIdSt){
            this.PermissionIdSt = PermissionIdSt;
            return this;
        }
        public ConditionBuilder PermissionIdLessEqThan(Integer PermissionIdEd){
            this.PermissionIdEd = PermissionIdEd;
            return this;
        }


        public ConditionBuilder PermissionIdList(Integer ... PermissionId){
            this.PermissionIdList = solveNullList(PermissionId);
            return this;
        }

        public ConditionBuilder PermissionIdList(List<Integer> PermissionId){
            this.PermissionIdList = PermissionId;
            return this;
        }

        public ConditionBuilder MenuIdBetWeen(Integer MenuIdSt,Integer MenuIdEd){
            this.MenuIdSt = MenuIdSt;
            this.MenuIdEd = MenuIdEd;
            return this;
        }

        public ConditionBuilder MenuIdGreaterEqThan(Integer MenuIdSt){
            this.MenuIdSt = MenuIdSt;
            return this;
        }
        public ConditionBuilder MenuIdLessEqThan(Integer MenuIdEd){
            this.MenuIdEd = MenuIdEd;
            return this;
        }


        public ConditionBuilder MenuIdList(Integer ... MenuId){
            this.MenuIdList = solveNullList(MenuId);
            return this;
        }

        public ConditionBuilder MenuIdList(List<Integer> MenuId){
            this.MenuIdList = MenuId;
            return this;
        }

        public ConditionBuilder fuzzyPermissionName (List<String> fuzzyPermissionName){
            this.fuzzyPermissionName = fuzzyPermissionName;
            return this;
        }

        public ConditionBuilder fuzzyPermissionName (String ... fuzzyPermissionName){
            this.fuzzyPermissionName = solveNullList(fuzzyPermissionName);
            return this;
        }

        public ConditionBuilder rightFuzzyPermissionName (List<String> rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = rightFuzzyPermissionName;
            return this;
        }

        public ConditionBuilder rightFuzzyPermissionName (String ... rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = solveNullList(rightFuzzyPermissionName);
            return this;
        }

        public ConditionBuilder PermissionNameList(String ... PermissionName){
            this.PermissionNameList = solveNullList(PermissionName);
            return this;
        }

        public ConditionBuilder PermissionNameList(List<String> PermissionName){
            this.PermissionNameList = PermissionName;
            return this;
        }

        public ConditionBuilder fuzzyPermissionDescription (List<String> fuzzyPermissionDescription){
            this.fuzzyPermissionDescription = fuzzyPermissionDescription;
            return this;
        }

        public ConditionBuilder fuzzyPermissionDescription (String ... fuzzyPermissionDescription){
            this.fuzzyPermissionDescription = solveNullList(fuzzyPermissionDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyPermissionDescription (List<String> rightFuzzyPermissionDescription){
            this.rightFuzzyPermissionDescription = rightFuzzyPermissionDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyPermissionDescription (String ... rightFuzzyPermissionDescription){
            this.rightFuzzyPermissionDescription = solveNullList(rightFuzzyPermissionDescription);
            return this;
        }

        public ConditionBuilder PermissionDescriptionList(String ... PermissionDescription){
            this.PermissionDescriptionList = solveNullList(PermissionDescription);
            return this;
        }

        public ConditionBuilder PermissionDescriptionList(List<String> PermissionDescription){
            this.PermissionDescriptionList = PermissionDescription;
            return this;
        }

        public ConditionBuilder ParentIdBetWeen(Integer ParentIdSt,Integer ParentIdEd){
            this.ParentIdSt = ParentIdSt;
            this.ParentIdEd = ParentIdEd;
            return this;
        }

        public ConditionBuilder ParentIdGreaterEqThan(Integer ParentIdSt){
            this.ParentIdSt = ParentIdSt;
            return this;
        }
        public ConditionBuilder ParentIdLessEqThan(Integer ParentIdEd){
            this.ParentIdEd = ParentIdEd;
            return this;
        }


        public ConditionBuilder ParentIdList(Integer ... ParentId){
            this.ParentIdList = solveNullList(ParentId);
            return this;
        }

        public ConditionBuilder ParentIdList(List<Integer> ParentId){
            this.ParentIdList = ParentId;
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

        private permision obj;

        public Builder(){
            this.obj = new permision();
        }

        public Builder PermissionId(Integer PermissionId){
            this.obj.setPermissionId(PermissionId);
            return this;
        }
        public Builder MenuId(Integer MenuId){
            this.obj.setMenuId(MenuId);
            return this;
        }
        public Builder PermissionName(String PermissionName){
            this.obj.setPermissionName(PermissionName);
            return this;
        }
        public Builder PermissionDescription(String PermissionDescription){
            this.obj.setPermissionDescription(PermissionDescription);
            return this;
        }
        public Builder ParentId(Integer ParentId){
            this.obj.setParentId(ParentId);
            return this;
        }
        public permision build(){return obj;}
    }

}

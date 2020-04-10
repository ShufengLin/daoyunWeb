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
    @Override
    public String toString() {
        return "menu{" +
                "MenuId='" + MenuId + '\'' +
                "MenuName='" + MenuName + '\'' +
                "MenuURL='" + MenuURL + '\'' +
                "MenuIcon='" + MenuIcon + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private menu set;

        private ConditionBuilder where;

        public UpdateBuilder set(menu set){
            this.set = set;
            return this;
        }

        public menu getSet(){
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

    public static class QueryBuilder extends menu{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> MenuIdList;

        public List<Integer> getMenuIdList(){return this.MenuIdList;}

        private Integer MenuIdSt;

        private Integer MenuIdEd;

        public Integer getMenuIdSt(){return this.MenuIdSt;}

        public Integer getMenuIdEd(){return this.MenuIdEd;}

        private List<String> MenuNameList;

        public List<String> getMenuNameList(){return this.MenuNameList;}


        private List<String> fuzzyMenuName;

        public List<String> getFuzzyMenuName(){return this.fuzzyMenuName;}

        private List<String> rightFuzzyMenuName;

        public List<String> getRightFuzzyMenuName(){return this.rightFuzzyMenuName;}
        private List<String> MenuURLList;

        public List<String> getMenuURLList(){return this.MenuURLList;}


        private List<String> fuzzyMenuURL;

        public List<String> getFuzzyMenuURL(){return this.fuzzyMenuURL;}

        private List<String> rightFuzzyMenuURL;

        public List<String> getRightFuzzyMenuURL(){return this.rightFuzzyMenuURL;}
        private List<String> MenuIconList;

        public List<String> getMenuIconList(){return this.MenuIconList;}


        private List<String> fuzzyMenuIcon;

        public List<String> getFuzzyMenuIcon(){return this.fuzzyMenuIcon;}

        private List<String> rightFuzzyMenuIcon;

        public List<String> getRightFuzzyMenuIcon(){return this.rightFuzzyMenuIcon;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyMenuName (List<String> fuzzyMenuName){
            this.fuzzyMenuName = fuzzyMenuName;
            return this;
        }

        public QueryBuilder fuzzyMenuName (String ... fuzzyMenuName){
            this.fuzzyMenuName = solveNullList(fuzzyMenuName);
            return this;
        }

        public QueryBuilder rightFuzzyMenuName (List<String> rightFuzzyMenuName){
            this.rightFuzzyMenuName = rightFuzzyMenuName;
            return this;
        }

        public QueryBuilder rightFuzzyMenuName (String ... rightFuzzyMenuName){
            this.rightFuzzyMenuName = solveNullList(rightFuzzyMenuName);
            return this;
        }

        public QueryBuilder MenuName(String MenuName){
            setMenuName(MenuName);
            return this;
        }

        public QueryBuilder MenuNameList(String ... MenuName){
            this.MenuNameList = solveNullList(MenuName);
            return this;
        }

        public QueryBuilder MenuNameList(List<String> MenuName){
            this.MenuNameList = MenuName;
            return this;
        }

        public QueryBuilder fetchMenuName(){
            setFetchFields("fetchFields","MenuName");
            return this;
        }

        public QueryBuilder excludeMenuName(){
            setFetchFields("excludeFields","MenuName");
            return this;
        }

        public QueryBuilder fuzzyMenuURL (List<String> fuzzyMenuURL){
            this.fuzzyMenuURL = fuzzyMenuURL;
            return this;
        }

        public QueryBuilder fuzzyMenuURL (String ... fuzzyMenuURL){
            this.fuzzyMenuURL = solveNullList(fuzzyMenuURL);
            return this;
        }

        public QueryBuilder rightFuzzyMenuURL (List<String> rightFuzzyMenuURL){
            this.rightFuzzyMenuURL = rightFuzzyMenuURL;
            return this;
        }

        public QueryBuilder rightFuzzyMenuURL (String ... rightFuzzyMenuURL){
            this.rightFuzzyMenuURL = solveNullList(rightFuzzyMenuURL);
            return this;
        }

        public QueryBuilder MenuURL(String MenuURL){
            setMenuURL(MenuURL);
            return this;
        }

        public QueryBuilder MenuURLList(String ... MenuURL){
            this.MenuURLList = solveNullList(MenuURL);
            return this;
        }

        public QueryBuilder MenuURLList(List<String> MenuURL){
            this.MenuURLList = MenuURL;
            return this;
        }

        public QueryBuilder fetchMenuURL(){
            setFetchFields("fetchFields","MenuURL");
            return this;
        }

        public QueryBuilder excludeMenuURL(){
            setFetchFields("excludeFields","MenuURL");
            return this;
        }

        public QueryBuilder fuzzyMenuIcon (List<String> fuzzyMenuIcon){
            this.fuzzyMenuIcon = fuzzyMenuIcon;
            return this;
        }

        public QueryBuilder fuzzyMenuIcon (String ... fuzzyMenuIcon){
            this.fuzzyMenuIcon = solveNullList(fuzzyMenuIcon);
            return this;
        }

        public QueryBuilder rightFuzzyMenuIcon (List<String> rightFuzzyMenuIcon){
            this.rightFuzzyMenuIcon = rightFuzzyMenuIcon;
            return this;
        }

        public QueryBuilder rightFuzzyMenuIcon (String ... rightFuzzyMenuIcon){
            this.rightFuzzyMenuIcon = solveNullList(rightFuzzyMenuIcon);
            return this;
        }

        public QueryBuilder MenuIcon(String MenuIcon){
            setMenuIcon(MenuIcon);
            return this;
        }

        public QueryBuilder MenuIconList(String ... MenuIcon){
            this.MenuIconList = solveNullList(MenuIcon);
            return this;
        }

        public QueryBuilder MenuIconList(List<String> MenuIcon){
            this.MenuIconList = MenuIcon;
            return this;
        }

        public QueryBuilder fetchMenuIcon(){
            setFetchFields("fetchFields","MenuIcon");
            return this;
        }

        public QueryBuilder excludeMenuIcon(){
            setFetchFields("excludeFields","MenuIcon");
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

        public menu build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> MenuIdList;

        public List<Integer> getMenuIdList(){return this.MenuIdList;}

        private Integer MenuIdSt;

        private Integer MenuIdEd;

        public Integer getMenuIdSt(){return this.MenuIdSt;}

        public Integer getMenuIdEd(){return this.MenuIdEd;}

        private List<String> MenuNameList;

        public List<String> getMenuNameList(){return this.MenuNameList;}


        private List<String> fuzzyMenuName;

        public List<String> getFuzzyMenuName(){return this.fuzzyMenuName;}

        private List<String> rightFuzzyMenuName;

        public List<String> getRightFuzzyMenuName(){return this.rightFuzzyMenuName;}
        private List<String> MenuURLList;

        public List<String> getMenuURLList(){return this.MenuURLList;}


        private List<String> fuzzyMenuURL;

        public List<String> getFuzzyMenuURL(){return this.fuzzyMenuURL;}

        private List<String> rightFuzzyMenuURL;

        public List<String> getRightFuzzyMenuURL(){return this.rightFuzzyMenuURL;}
        private List<String> MenuIconList;

        public List<String> getMenuIconList(){return this.MenuIconList;}


        private List<String> fuzzyMenuIcon;

        public List<String> getFuzzyMenuIcon(){return this.fuzzyMenuIcon;}

        private List<String> rightFuzzyMenuIcon;

        public List<String> getRightFuzzyMenuIcon(){return this.rightFuzzyMenuIcon;}

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

        public ConditionBuilder fuzzyMenuName (List<String> fuzzyMenuName){
            this.fuzzyMenuName = fuzzyMenuName;
            return this;
        }

        public ConditionBuilder fuzzyMenuName (String ... fuzzyMenuName){
            this.fuzzyMenuName = solveNullList(fuzzyMenuName);
            return this;
        }

        public ConditionBuilder rightFuzzyMenuName (List<String> rightFuzzyMenuName){
            this.rightFuzzyMenuName = rightFuzzyMenuName;
            return this;
        }

        public ConditionBuilder rightFuzzyMenuName (String ... rightFuzzyMenuName){
            this.rightFuzzyMenuName = solveNullList(rightFuzzyMenuName);
            return this;
        }

        public ConditionBuilder MenuNameList(String ... MenuName){
            this.MenuNameList = solveNullList(MenuName);
            return this;
        }

        public ConditionBuilder MenuNameList(List<String> MenuName){
            this.MenuNameList = MenuName;
            return this;
        }

        public ConditionBuilder fuzzyMenuURL (List<String> fuzzyMenuURL){
            this.fuzzyMenuURL = fuzzyMenuURL;
            return this;
        }

        public ConditionBuilder fuzzyMenuURL (String ... fuzzyMenuURL){
            this.fuzzyMenuURL = solveNullList(fuzzyMenuURL);
            return this;
        }

        public ConditionBuilder rightFuzzyMenuURL (List<String> rightFuzzyMenuURL){
            this.rightFuzzyMenuURL = rightFuzzyMenuURL;
            return this;
        }

        public ConditionBuilder rightFuzzyMenuURL (String ... rightFuzzyMenuURL){
            this.rightFuzzyMenuURL = solveNullList(rightFuzzyMenuURL);
            return this;
        }

        public ConditionBuilder MenuURLList(String ... MenuURL){
            this.MenuURLList = solveNullList(MenuURL);
            return this;
        }

        public ConditionBuilder MenuURLList(List<String> MenuURL){
            this.MenuURLList = MenuURL;
            return this;
        }

        public ConditionBuilder fuzzyMenuIcon (List<String> fuzzyMenuIcon){
            this.fuzzyMenuIcon = fuzzyMenuIcon;
            return this;
        }

        public ConditionBuilder fuzzyMenuIcon (String ... fuzzyMenuIcon){
            this.fuzzyMenuIcon = solveNullList(fuzzyMenuIcon);
            return this;
        }

        public ConditionBuilder rightFuzzyMenuIcon (List<String> rightFuzzyMenuIcon){
            this.rightFuzzyMenuIcon = rightFuzzyMenuIcon;
            return this;
        }

        public ConditionBuilder rightFuzzyMenuIcon (String ... rightFuzzyMenuIcon){
            this.rightFuzzyMenuIcon = solveNullList(rightFuzzyMenuIcon);
            return this;
        }

        public ConditionBuilder MenuIconList(String ... MenuIcon){
            this.MenuIconList = solveNullList(MenuIcon);
            return this;
        }

        public ConditionBuilder MenuIconList(List<String> MenuIcon){
            this.MenuIconList = MenuIcon;
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

        private menu obj;

        public Builder(){
            this.obj = new menu();
        }

        public Builder MenuId(Integer MenuId){
            this.obj.setMenuId(MenuId);
            return this;
        }
        public Builder MenuName(String MenuName){
            this.obj.setMenuName(MenuName);
            return this;
        }
        public Builder MenuURL(String MenuURL){
            this.obj.setMenuURL(MenuURL);
            return this;
        }
        public Builder MenuIcon(String MenuIcon){
            this.obj.setMenuIcon(MenuIcon);
            return this;
        }
        public menu build(){return obj;}
    }

}

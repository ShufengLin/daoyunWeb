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
public class role implements Serializable {

    private static final long serialVersionUID = 1586522782694L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer RoleId;

    /**
    * 
    * isNullAble:1
    */
    private String RoleName;

    /**
    * 
    * isNullAble:1
    */
    private String RoleDescription;

    /**
    * 
    * isNullAble:1
    */
    private Integer IsLock;

    /**
    * 
    * isNullAble:1
    */
    private String Creator;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime CreationDate;


    public void setRoleId(Integer RoleId){this.RoleId = RoleId;}

    public Integer getRoleId(){return this.RoleId;}

    public void setRoleName(String RoleName){this.RoleName = RoleName;}

    public String getRoleName(){return this.RoleName;}

    public void setRoleDescription(String RoleDescription){this.RoleDescription = RoleDescription;}

    public String getRoleDescription(){return this.RoleDescription;}

    public void setIsLock(Integer IsLock){this.IsLock = IsLock;}

    public Integer getIsLock(){return this.IsLock;}

    public void setCreator(String Creator){this.Creator = Creator;}

    public String getCreator(){return this.Creator;}

    public void setCreationDate(java.time.LocalDateTime CreationDate){this.CreationDate = CreationDate;}

    public java.time.LocalDateTime getCreationDate(){return this.CreationDate;}
    @Override
    public String toString() {
        return "role{" +
                "RoleId='" + RoleId + '\'' +
                "RoleName='" + RoleName + '\'' +
                "RoleDescription='" + RoleDescription + '\'' +
                "IsLock='" + IsLock + '\'' +
                "Creator='" + Creator + '\'' +
                "CreationDate='" + CreationDate + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private role set;

        private ConditionBuilder where;

        public UpdateBuilder set(role set){
            this.set = set;
            return this;
        }

        public role getSet(){
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

    public static class QueryBuilder extends role{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> RoleIdList;

        public List<Integer> getRoleIdList(){return this.RoleIdList;}

        private Integer RoleIdSt;

        private Integer RoleIdEd;

        public Integer getRoleIdSt(){return this.RoleIdSt;}

        public Integer getRoleIdEd(){return this.RoleIdEd;}

        private List<String> RoleNameList;

        public List<String> getRoleNameList(){return this.RoleNameList;}


        private List<String> fuzzyRoleName;

        public List<String> getFuzzyRoleName(){return this.fuzzyRoleName;}

        private List<String> rightFuzzyRoleName;

        public List<String> getRightFuzzyRoleName(){return this.rightFuzzyRoleName;}
        private List<String> RoleDescriptionList;

        public List<String> getRoleDescriptionList(){return this.RoleDescriptionList;}


        private List<String> fuzzyRoleDescription;

        public List<String> getFuzzyRoleDescription(){return this.fuzzyRoleDescription;}

        private List<String> rightFuzzyRoleDescription;

        public List<String> getRightFuzzyRoleDescription(){return this.rightFuzzyRoleDescription;}
        private List<Integer> IsLockList;

        public List<Integer> getIsLockList(){return this.IsLockList;}

        private Integer IsLockSt;

        private Integer IsLockEd;

        public Integer getIsLockSt(){return this.IsLockSt;}

        public Integer getIsLockEd(){return this.IsLockEd;}

        private List<String> CreatorList;

        public List<String> getCreatorList(){return this.CreatorList;}


        private List<String> fuzzyCreator;

        public List<String> getFuzzyCreator(){return this.fuzzyCreator;}

        private List<String> rightFuzzyCreator;

        public List<String> getRightFuzzyCreator(){return this.rightFuzzyCreator;}
        private List<java.time.LocalDateTime> CreationDateList;

        public List<java.time.LocalDateTime> getCreationDateList(){return this.CreationDateList;}

        private java.time.LocalDateTime CreationDateSt;

        private java.time.LocalDateTime CreationDateEd;

        public java.time.LocalDateTime getCreationDateSt(){return this.CreationDateSt;}

        public java.time.LocalDateTime getCreationDateEd(){return this.CreationDateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder RoleIdBetWeen(Integer RoleIdSt,Integer RoleIdEd){
            this.RoleIdSt = RoleIdSt;
            this.RoleIdEd = RoleIdEd;
            return this;
        }

        public QueryBuilder RoleIdGreaterEqThan(Integer RoleIdSt){
            this.RoleIdSt = RoleIdSt;
            return this;
        }
        public QueryBuilder RoleIdLessEqThan(Integer RoleIdEd){
            this.RoleIdEd = RoleIdEd;
            return this;
        }


        public QueryBuilder RoleId(Integer RoleId){
            setRoleId(RoleId);
            return this;
        }

        public QueryBuilder RoleIdList(Integer ... RoleId){
            this.RoleIdList = solveNullList(RoleId);
            return this;
        }

        public QueryBuilder RoleIdList(List<Integer> RoleId){
            this.RoleIdList = RoleId;
            return this;
        }

        public QueryBuilder fetchRoleId(){
            setFetchFields("fetchFields","RoleId");
            return this;
        }

        public QueryBuilder excludeRoleId(){
            setFetchFields("excludeFields","RoleId");
            return this;
        }

        public QueryBuilder fuzzyRoleName (List<String> fuzzyRoleName){
            this.fuzzyRoleName = fuzzyRoleName;
            return this;
        }

        public QueryBuilder fuzzyRoleName (String ... fuzzyRoleName){
            this.fuzzyRoleName = solveNullList(fuzzyRoleName);
            return this;
        }

        public QueryBuilder rightFuzzyRoleName (List<String> rightFuzzyRoleName){
            this.rightFuzzyRoleName = rightFuzzyRoleName;
            return this;
        }

        public QueryBuilder rightFuzzyRoleName (String ... rightFuzzyRoleName){
            this.rightFuzzyRoleName = solveNullList(rightFuzzyRoleName);
            return this;
        }

        public QueryBuilder RoleName(String RoleName){
            setRoleName(RoleName);
            return this;
        }

        public QueryBuilder RoleNameList(String ... RoleName){
            this.RoleNameList = solveNullList(RoleName);
            return this;
        }

        public QueryBuilder RoleNameList(List<String> RoleName){
            this.RoleNameList = RoleName;
            return this;
        }

        public QueryBuilder fetchRoleName(){
            setFetchFields("fetchFields","RoleName");
            return this;
        }

        public QueryBuilder excludeRoleName(){
            setFetchFields("excludeFields","RoleName");
            return this;
        }

        public QueryBuilder fuzzyRoleDescription (List<String> fuzzyRoleDescription){
            this.fuzzyRoleDescription = fuzzyRoleDescription;
            return this;
        }

        public QueryBuilder fuzzyRoleDescription (String ... fuzzyRoleDescription){
            this.fuzzyRoleDescription = solveNullList(fuzzyRoleDescription);
            return this;
        }

        public QueryBuilder rightFuzzyRoleDescription (List<String> rightFuzzyRoleDescription){
            this.rightFuzzyRoleDescription = rightFuzzyRoleDescription;
            return this;
        }

        public QueryBuilder rightFuzzyRoleDescription (String ... rightFuzzyRoleDescription){
            this.rightFuzzyRoleDescription = solveNullList(rightFuzzyRoleDescription);
            return this;
        }

        public QueryBuilder RoleDescription(String RoleDescription){
            setRoleDescription(RoleDescription);
            return this;
        }

        public QueryBuilder RoleDescriptionList(String ... RoleDescription){
            this.RoleDescriptionList = solveNullList(RoleDescription);
            return this;
        }

        public QueryBuilder RoleDescriptionList(List<String> RoleDescription){
            this.RoleDescriptionList = RoleDescription;
            return this;
        }

        public QueryBuilder fetchRoleDescription(){
            setFetchFields("fetchFields","RoleDescription");
            return this;
        }

        public QueryBuilder excludeRoleDescription(){
            setFetchFields("excludeFields","RoleDescription");
            return this;
        }

        public QueryBuilder IsLockBetWeen(Integer IsLockSt,Integer IsLockEd){
            this.IsLockSt = IsLockSt;
            this.IsLockEd = IsLockEd;
            return this;
        }

        public QueryBuilder IsLockGreaterEqThan(Integer IsLockSt){
            this.IsLockSt = IsLockSt;
            return this;
        }
        public QueryBuilder IsLockLessEqThan(Integer IsLockEd){
            this.IsLockEd = IsLockEd;
            return this;
        }


        public QueryBuilder IsLock(Integer IsLock){
            setIsLock(IsLock);
            return this;
        }

        public QueryBuilder IsLockList(Integer ... IsLock){
            this.IsLockList = solveNullList(IsLock);
            return this;
        }

        public QueryBuilder IsLockList(List<Integer> IsLock){
            this.IsLockList = IsLock;
            return this;
        }

        public QueryBuilder fetchIsLock(){
            setFetchFields("fetchFields","IsLock");
            return this;
        }

        public QueryBuilder excludeIsLock(){
            setFetchFields("excludeFields","IsLock");
            return this;
        }

        public QueryBuilder fuzzyCreator (List<String> fuzzyCreator){
            this.fuzzyCreator = fuzzyCreator;
            return this;
        }

        public QueryBuilder fuzzyCreator (String ... fuzzyCreator){
            this.fuzzyCreator = solveNullList(fuzzyCreator);
            return this;
        }

        public QueryBuilder rightFuzzyCreator (List<String> rightFuzzyCreator){
            this.rightFuzzyCreator = rightFuzzyCreator;
            return this;
        }

        public QueryBuilder rightFuzzyCreator (String ... rightFuzzyCreator){
            this.rightFuzzyCreator = solveNullList(rightFuzzyCreator);
            return this;
        }

        public QueryBuilder Creator(String Creator){
            setCreator(Creator);
            return this;
        }

        public QueryBuilder CreatorList(String ... Creator){
            this.CreatorList = solveNullList(Creator);
            return this;
        }

        public QueryBuilder CreatorList(List<String> Creator){
            this.CreatorList = Creator;
            return this;
        }

        public QueryBuilder fetchCreator(){
            setFetchFields("fetchFields","Creator");
            return this;
        }

        public QueryBuilder excludeCreator(){
            setFetchFields("excludeFields","Creator");
            return this;
        }

        public QueryBuilder CreationDateBetWeen(java.time.LocalDateTime CreationDateSt,java.time.LocalDateTime CreationDateEd){
            this.CreationDateSt = CreationDateSt;
            this.CreationDateEd = CreationDateEd;
            return this;
        }

        public QueryBuilder CreationDateGreaterEqThan(java.time.LocalDateTime CreationDateSt){
            this.CreationDateSt = CreationDateSt;
            return this;
        }
        public QueryBuilder CreationDateLessEqThan(java.time.LocalDateTime CreationDateEd){
            this.CreationDateEd = CreationDateEd;
            return this;
        }


        public QueryBuilder CreationDate(java.time.LocalDateTime CreationDate){
            setCreationDate(CreationDate);
            return this;
        }

        public QueryBuilder CreationDateList(java.time.LocalDateTime ... CreationDate){
            this.CreationDateList = solveNullList(CreationDate);
            return this;
        }

        public QueryBuilder CreationDateList(List<java.time.LocalDateTime> CreationDate){
            this.CreationDateList = CreationDate;
            return this;
        }

        public QueryBuilder fetchCreationDate(){
            setFetchFields("fetchFields","CreationDate");
            return this;
        }

        public QueryBuilder excludeCreationDate(){
            setFetchFields("excludeFields","CreationDate");
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

        public role build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> RoleIdList;

        public List<Integer> getRoleIdList(){return this.RoleIdList;}

        private Integer RoleIdSt;

        private Integer RoleIdEd;

        public Integer getRoleIdSt(){return this.RoleIdSt;}

        public Integer getRoleIdEd(){return this.RoleIdEd;}

        private List<String> RoleNameList;

        public List<String> getRoleNameList(){return this.RoleNameList;}


        private List<String> fuzzyRoleName;

        public List<String> getFuzzyRoleName(){return this.fuzzyRoleName;}

        private List<String> rightFuzzyRoleName;

        public List<String> getRightFuzzyRoleName(){return this.rightFuzzyRoleName;}
        private List<String> RoleDescriptionList;

        public List<String> getRoleDescriptionList(){return this.RoleDescriptionList;}


        private List<String> fuzzyRoleDescription;

        public List<String> getFuzzyRoleDescription(){return this.fuzzyRoleDescription;}

        private List<String> rightFuzzyRoleDescription;

        public List<String> getRightFuzzyRoleDescription(){return this.rightFuzzyRoleDescription;}
        private List<Integer> IsLockList;

        public List<Integer> getIsLockList(){return this.IsLockList;}

        private Integer IsLockSt;

        private Integer IsLockEd;

        public Integer getIsLockSt(){return this.IsLockSt;}

        public Integer getIsLockEd(){return this.IsLockEd;}

        private List<String> CreatorList;

        public List<String> getCreatorList(){return this.CreatorList;}


        private List<String> fuzzyCreator;

        public List<String> getFuzzyCreator(){return this.fuzzyCreator;}

        private List<String> rightFuzzyCreator;

        public List<String> getRightFuzzyCreator(){return this.rightFuzzyCreator;}
        private List<java.time.LocalDateTime> CreationDateList;

        public List<java.time.LocalDateTime> getCreationDateList(){return this.CreationDateList;}

        private java.time.LocalDateTime CreationDateSt;

        private java.time.LocalDateTime CreationDateEd;

        public java.time.LocalDateTime getCreationDateSt(){return this.CreationDateSt;}

        public java.time.LocalDateTime getCreationDateEd(){return this.CreationDateEd;}


        public ConditionBuilder RoleIdBetWeen(Integer RoleIdSt,Integer RoleIdEd){
            this.RoleIdSt = RoleIdSt;
            this.RoleIdEd = RoleIdEd;
            return this;
        }

        public ConditionBuilder RoleIdGreaterEqThan(Integer RoleIdSt){
            this.RoleIdSt = RoleIdSt;
            return this;
        }
        public ConditionBuilder RoleIdLessEqThan(Integer RoleIdEd){
            this.RoleIdEd = RoleIdEd;
            return this;
        }


        public ConditionBuilder RoleIdList(Integer ... RoleId){
            this.RoleIdList = solveNullList(RoleId);
            return this;
        }

        public ConditionBuilder RoleIdList(List<Integer> RoleId){
            this.RoleIdList = RoleId;
            return this;
        }

        public ConditionBuilder fuzzyRoleName (List<String> fuzzyRoleName){
            this.fuzzyRoleName = fuzzyRoleName;
            return this;
        }

        public ConditionBuilder fuzzyRoleName (String ... fuzzyRoleName){
            this.fuzzyRoleName = solveNullList(fuzzyRoleName);
            return this;
        }

        public ConditionBuilder rightFuzzyRoleName (List<String> rightFuzzyRoleName){
            this.rightFuzzyRoleName = rightFuzzyRoleName;
            return this;
        }

        public ConditionBuilder rightFuzzyRoleName (String ... rightFuzzyRoleName){
            this.rightFuzzyRoleName = solveNullList(rightFuzzyRoleName);
            return this;
        }

        public ConditionBuilder RoleNameList(String ... RoleName){
            this.RoleNameList = solveNullList(RoleName);
            return this;
        }

        public ConditionBuilder RoleNameList(List<String> RoleName){
            this.RoleNameList = RoleName;
            return this;
        }

        public ConditionBuilder fuzzyRoleDescription (List<String> fuzzyRoleDescription){
            this.fuzzyRoleDescription = fuzzyRoleDescription;
            return this;
        }

        public ConditionBuilder fuzzyRoleDescription (String ... fuzzyRoleDescription){
            this.fuzzyRoleDescription = solveNullList(fuzzyRoleDescription);
            return this;
        }

        public ConditionBuilder rightFuzzyRoleDescription (List<String> rightFuzzyRoleDescription){
            this.rightFuzzyRoleDescription = rightFuzzyRoleDescription;
            return this;
        }

        public ConditionBuilder rightFuzzyRoleDescription (String ... rightFuzzyRoleDescription){
            this.rightFuzzyRoleDescription = solveNullList(rightFuzzyRoleDescription);
            return this;
        }

        public ConditionBuilder RoleDescriptionList(String ... RoleDescription){
            this.RoleDescriptionList = solveNullList(RoleDescription);
            return this;
        }

        public ConditionBuilder RoleDescriptionList(List<String> RoleDescription){
            this.RoleDescriptionList = RoleDescription;
            return this;
        }

        public ConditionBuilder IsLockBetWeen(Integer IsLockSt,Integer IsLockEd){
            this.IsLockSt = IsLockSt;
            this.IsLockEd = IsLockEd;
            return this;
        }

        public ConditionBuilder IsLockGreaterEqThan(Integer IsLockSt){
            this.IsLockSt = IsLockSt;
            return this;
        }
        public ConditionBuilder IsLockLessEqThan(Integer IsLockEd){
            this.IsLockEd = IsLockEd;
            return this;
        }


        public ConditionBuilder IsLockList(Integer ... IsLock){
            this.IsLockList = solveNullList(IsLock);
            return this;
        }

        public ConditionBuilder IsLockList(List<Integer> IsLock){
            this.IsLockList = IsLock;
            return this;
        }

        public ConditionBuilder fuzzyCreator (List<String> fuzzyCreator){
            this.fuzzyCreator = fuzzyCreator;
            return this;
        }

        public ConditionBuilder fuzzyCreator (String ... fuzzyCreator){
            this.fuzzyCreator = solveNullList(fuzzyCreator);
            return this;
        }

        public ConditionBuilder rightFuzzyCreator (List<String> rightFuzzyCreator){
            this.rightFuzzyCreator = rightFuzzyCreator;
            return this;
        }

        public ConditionBuilder rightFuzzyCreator (String ... rightFuzzyCreator){
            this.rightFuzzyCreator = solveNullList(rightFuzzyCreator);
            return this;
        }

        public ConditionBuilder CreatorList(String ... Creator){
            this.CreatorList = solveNullList(Creator);
            return this;
        }

        public ConditionBuilder CreatorList(List<String> Creator){
            this.CreatorList = Creator;
            return this;
        }

        public ConditionBuilder CreationDateBetWeen(java.time.LocalDateTime CreationDateSt,java.time.LocalDateTime CreationDateEd){
            this.CreationDateSt = CreationDateSt;
            this.CreationDateEd = CreationDateEd;
            return this;
        }

        public ConditionBuilder CreationDateGreaterEqThan(java.time.LocalDateTime CreationDateSt){
            this.CreationDateSt = CreationDateSt;
            return this;
        }
        public ConditionBuilder CreationDateLessEqThan(java.time.LocalDateTime CreationDateEd){
            this.CreationDateEd = CreationDateEd;
            return this;
        }


        public ConditionBuilder CreationDateList(java.time.LocalDateTime ... CreationDate){
            this.CreationDateList = solveNullList(CreationDate);
            return this;
        }

        public ConditionBuilder CreationDateList(List<java.time.LocalDateTime> CreationDate){
            this.CreationDateList = CreationDate;
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

        private role obj;

        public Builder(){
            this.obj = new role();
        }

        public Builder RoleId(Integer RoleId){
            this.obj.setRoleId(RoleId);
            return this;
        }
        public Builder RoleName(String RoleName){
            this.obj.setRoleName(RoleName);
            return this;
        }
        public Builder RoleDescription(String RoleDescription){
            this.obj.setRoleDescription(RoleDescription);
            return this;
        }
        public Builder IsLock(Integer IsLock){
            this.obj.setIsLock(IsLock);
            return this;
        }
        public Builder Creator(String Creator){
            this.obj.setCreator(Creator);
            return this;
        }
        public Builder CreationDate(java.time.LocalDateTime CreationDate){
            this.obj.setCreationDate(CreationDate);
            return this;
        }
        public role build(){return obj;}
    }

}

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
    @Override
    public String toString() {
        return "roledescription{" +
                "RolePermisionId='" + RolePermisionId + '\'' +
                "RoleId='" + RoleId + '\'' +
                "RightId='" + RightId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private roledescription set;

        private ConditionBuilder where;

        public UpdateBuilder set(roledescription set){
            this.set = set;
            return this;
        }

        public roledescription getSet(){
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

    public static class QueryBuilder extends roledescription{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> RolePermisionIdList;

        public List<Integer> getRolePermisionIdList(){return this.RolePermisionIdList;}

        private Integer RolePermisionIdSt;

        private Integer RolePermisionIdEd;

        public Integer getRolePermisionIdSt(){return this.RolePermisionIdSt;}

        public Integer getRolePermisionIdEd(){return this.RolePermisionIdEd;}

        private List<Integer> RoleIdList;

        public List<Integer> getRoleIdList(){return this.RoleIdList;}

        private Integer RoleIdSt;

        private Integer RoleIdEd;

        public Integer getRoleIdSt(){return this.RoleIdSt;}

        public Integer getRoleIdEd(){return this.RoleIdEd;}

        private List<Integer> RightIdList;

        public List<Integer> getRightIdList(){return this.RightIdList;}

        private Integer RightIdSt;

        private Integer RightIdEd;

        public Integer getRightIdSt(){return this.RightIdSt;}

        public Integer getRightIdEd(){return this.RightIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder RolePermisionIdBetWeen(Integer RolePermisionIdSt,Integer RolePermisionIdEd){
            this.RolePermisionIdSt = RolePermisionIdSt;
            this.RolePermisionIdEd = RolePermisionIdEd;
            return this;
        }

        public QueryBuilder RolePermisionIdGreaterEqThan(Integer RolePermisionIdSt){
            this.RolePermisionIdSt = RolePermisionIdSt;
            return this;
        }
        public QueryBuilder RolePermisionIdLessEqThan(Integer RolePermisionIdEd){
            this.RolePermisionIdEd = RolePermisionIdEd;
            return this;
        }


        public QueryBuilder RolePermisionId(Integer RolePermisionId){
            setRolePermisionId(RolePermisionId);
            return this;
        }

        public QueryBuilder RolePermisionIdList(Integer ... RolePermisionId){
            this.RolePermisionIdList = solveNullList(RolePermisionId);
            return this;
        }

        public QueryBuilder RolePermisionIdList(List<Integer> RolePermisionId){
            this.RolePermisionIdList = RolePermisionId;
            return this;
        }

        public QueryBuilder fetchRolePermisionId(){
            setFetchFields("fetchFields","RolePermisionId");
            return this;
        }

        public QueryBuilder excludeRolePermisionId(){
            setFetchFields("excludeFields","RolePermisionId");
            return this;
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

        public QueryBuilder RightIdBetWeen(Integer RightIdSt,Integer RightIdEd){
            this.RightIdSt = RightIdSt;
            this.RightIdEd = RightIdEd;
            return this;
        }

        public QueryBuilder RightIdGreaterEqThan(Integer RightIdSt){
            this.RightIdSt = RightIdSt;
            return this;
        }
        public QueryBuilder RightIdLessEqThan(Integer RightIdEd){
            this.RightIdEd = RightIdEd;
            return this;
        }


        public QueryBuilder RightId(Integer RightId){
            setRightId(RightId);
            return this;
        }

        public QueryBuilder RightIdList(Integer ... RightId){
            this.RightIdList = solveNullList(RightId);
            return this;
        }

        public QueryBuilder RightIdList(List<Integer> RightId){
            this.RightIdList = RightId;
            return this;
        }

        public QueryBuilder fetchRightId(){
            setFetchFields("fetchFields","RightId");
            return this;
        }

        public QueryBuilder excludeRightId(){
            setFetchFields("excludeFields","RightId");
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

        public roledescription build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> RolePermisionIdList;

        public List<Integer> getRolePermisionIdList(){return this.RolePermisionIdList;}

        private Integer RolePermisionIdSt;

        private Integer RolePermisionIdEd;

        public Integer getRolePermisionIdSt(){return this.RolePermisionIdSt;}

        public Integer getRolePermisionIdEd(){return this.RolePermisionIdEd;}

        private List<Integer> RoleIdList;

        public List<Integer> getRoleIdList(){return this.RoleIdList;}

        private Integer RoleIdSt;

        private Integer RoleIdEd;

        public Integer getRoleIdSt(){return this.RoleIdSt;}

        public Integer getRoleIdEd(){return this.RoleIdEd;}

        private List<Integer> RightIdList;

        public List<Integer> getRightIdList(){return this.RightIdList;}

        private Integer RightIdSt;

        private Integer RightIdEd;

        public Integer getRightIdSt(){return this.RightIdSt;}

        public Integer getRightIdEd(){return this.RightIdEd;}


        public ConditionBuilder RolePermisionIdBetWeen(Integer RolePermisionIdSt,Integer RolePermisionIdEd){
            this.RolePermisionIdSt = RolePermisionIdSt;
            this.RolePermisionIdEd = RolePermisionIdEd;
            return this;
        }

        public ConditionBuilder RolePermisionIdGreaterEqThan(Integer RolePermisionIdSt){
            this.RolePermisionIdSt = RolePermisionIdSt;
            return this;
        }
        public ConditionBuilder RolePermisionIdLessEqThan(Integer RolePermisionIdEd){
            this.RolePermisionIdEd = RolePermisionIdEd;
            return this;
        }


        public ConditionBuilder RolePermisionIdList(Integer ... RolePermisionId){
            this.RolePermisionIdList = solveNullList(RolePermisionId);
            return this;
        }

        public ConditionBuilder RolePermisionIdList(List<Integer> RolePermisionId){
            this.RolePermisionIdList = RolePermisionId;
            return this;
        }

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

        public ConditionBuilder RightIdBetWeen(Integer RightIdSt,Integer RightIdEd){
            this.RightIdSt = RightIdSt;
            this.RightIdEd = RightIdEd;
            return this;
        }

        public ConditionBuilder RightIdGreaterEqThan(Integer RightIdSt){
            this.RightIdSt = RightIdSt;
            return this;
        }
        public ConditionBuilder RightIdLessEqThan(Integer RightIdEd){
            this.RightIdEd = RightIdEd;
            return this;
        }


        public ConditionBuilder RightIdList(Integer ... RightId){
            this.RightIdList = solveNullList(RightId);
            return this;
        }

        public ConditionBuilder RightIdList(List<Integer> RightId){
            this.RightIdList = RightId;
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

        private roledescription obj;

        public Builder(){
            this.obj = new roledescription();
        }

        public Builder RolePermisionId(Integer RolePermisionId){
            this.obj.setRolePermisionId(RolePermisionId);
            return this;
        }
        public Builder RoleId(Integer RoleId){
            this.obj.setRoleId(RoleId);
            return this;
        }
        public Builder RightId(Integer RightId){
            this.obj.setRightId(RightId);
            return this;
        }
        public roledescription build(){return obj;}
    }

}

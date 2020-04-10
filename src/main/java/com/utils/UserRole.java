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
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1586522787826L;


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
    private Integer UserId;

    /**
    * 
    * isNullAble:1
    */
    private Integer RoleId;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setUserId(Integer UserId){this.UserId = UserId;}

    public Integer getUserId(){return this.UserId;}

    public void setRoleId(Integer RoleId){this.RoleId = RoleId;}

    public Integer getRoleId(){return this.RoleId;}
    @Override
    public String toString() {
        return "UserRole{" +
                "Id='" + Id + '\'' +
                "UserId='" + UserId + '\'' +
                "RoleId='" + RoleId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserRole set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserRole set){
            this.set = set;
            return this;
        }

        public UserRole getSet(){
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

    public static class QueryBuilder extends UserRole{
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

        private List<Integer> UserIdList;

        public List<Integer> getUserIdList(){return this.UserIdList;}

        private Integer UserIdSt;

        private Integer UserIdEd;

        public Integer getUserIdSt(){return this.UserIdSt;}

        public Integer getUserIdEd(){return this.UserIdEd;}

        private List<Integer> RoleIdList;

        public List<Integer> getRoleIdList(){return this.RoleIdList;}

        private Integer RoleIdSt;

        private Integer RoleIdEd;

        public Integer getRoleIdSt(){return this.RoleIdSt;}

        public Integer getRoleIdEd(){return this.RoleIdEd;}

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

        public QueryBuilder UserIdBetWeen(Integer UserIdSt,Integer UserIdEd){
            this.UserIdSt = UserIdSt;
            this.UserIdEd = UserIdEd;
            return this;
        }

        public QueryBuilder UserIdGreaterEqThan(Integer UserIdSt){
            this.UserIdSt = UserIdSt;
            return this;
        }
        public QueryBuilder UserIdLessEqThan(Integer UserIdEd){
            this.UserIdEd = UserIdEd;
            return this;
        }


        public QueryBuilder UserId(Integer UserId){
            setUserId(UserId);
            return this;
        }

        public QueryBuilder UserIdList(Integer ... UserId){
            this.UserIdList = solveNullList(UserId);
            return this;
        }

        public QueryBuilder UserIdList(List<Integer> UserId){
            this.UserIdList = UserId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","UserId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","UserId");
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

        public UserRole build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<Integer> UserIdList;

        public List<Integer> getUserIdList(){return this.UserIdList;}

        private Integer UserIdSt;

        private Integer UserIdEd;

        public Integer getUserIdSt(){return this.UserIdSt;}

        public Integer getUserIdEd(){return this.UserIdEd;}

        private List<Integer> RoleIdList;

        public List<Integer> getRoleIdList(){return this.RoleIdList;}

        private Integer RoleIdSt;

        private Integer RoleIdEd;

        public Integer getRoleIdSt(){return this.RoleIdSt;}

        public Integer getRoleIdEd(){return this.RoleIdEd;}


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

        public ConditionBuilder UserIdBetWeen(Integer UserIdSt,Integer UserIdEd){
            this.UserIdSt = UserIdSt;
            this.UserIdEd = UserIdEd;
            return this;
        }

        public ConditionBuilder UserIdGreaterEqThan(Integer UserIdSt){
            this.UserIdSt = UserIdSt;
            return this;
        }
        public ConditionBuilder UserIdLessEqThan(Integer UserIdEd){
            this.UserIdEd = UserIdEd;
            return this;
        }


        public ConditionBuilder UserIdList(Integer ... UserId){
            this.UserIdList = solveNullList(UserId);
            return this;
        }

        public ConditionBuilder UserIdList(List<Integer> UserId){
            this.UserIdList = UserId;
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

        private UserRole obj;

        public Builder(){
            this.obj = new UserRole();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder UserId(Integer UserId){
            this.obj.setUserId(UserId);
            return this;
        }
        public Builder RoleId(Integer RoleId){
            this.obj.setRoleId(RoleId);
            return this;
        }
        public UserRole build(){return obj;}
    }

}

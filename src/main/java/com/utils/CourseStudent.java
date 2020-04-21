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
public class CourseStudent implements Serializable {

    private static final long serialVersionUID = 1586522773785L;


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
    private Integer CourseId;

    /**
    * 
    * isNullAble:1
    */
    private Integer StudentId;

    /**
    * 
    * isNullAble:1
    */
    private Integer StudentEXP;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setStudentId(Integer StudentId){this.StudentId = StudentId;}

    public Integer getStudentId(){return this.StudentId;}

    public void setStudentEXP(Integer StudentEXP){this.StudentEXP = StudentEXP;}

    public Integer getStudentEXP(){return this.StudentEXP;}
    @Override
    public String toString() {
        return "CourseStudent{" +
                "Id='" + Id + '\'' +
                "CourseId='" + CourseId + '\'' +
                "StudentId='" + StudentId + '\'' +
                "StudentEXP='" + StudentEXP + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CourseStudent set;

        private ConditionBuilder where;

        public UpdateBuilder set(CourseStudent set){
            this.set = set;
            return this;
        }

        public CourseStudent getSet(){
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

    public static class QueryBuilder extends CourseStudent{
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

        private List<Integer> CourseIdList;

        public List<Integer> getCourseIdList(){return this.CourseIdList;}

        private Integer CourseIdSt;

        private Integer CourseIdEd;

        public Integer getCourseIdSt(){return this.CourseIdSt;}

        public Integer getCourseIdEd(){return this.CourseIdEd;}

        private List<Integer> StudentIdList;

        public List<Integer> getStudentIdList(){return this.StudentIdList;}

        private Integer StudentIdSt;

        private Integer StudentIdEd;

        public Integer getStudentIdSt(){return this.StudentIdSt;}

        public Integer getStudentIdEd(){return this.StudentIdEd;}

        private List<Integer> StudentEXPList;

        public List<Integer> getStudentEXPList(){return this.StudentEXPList;}

        private Integer StudentEXPSt;

        private Integer StudentEXPEd;

        public Integer getStudentEXPSt(){return this.StudentEXPSt;}

        public Integer getStudentEXPEd(){return this.StudentEXPEd;}

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

        public QueryBuilder CourseIdBetWeen(Integer CourseIdSt,Integer CourseIdEd){
            this.CourseIdSt = CourseIdSt;
            this.CourseIdEd = CourseIdEd;
            return this;
        }

        public QueryBuilder CourseIdGreaterEqThan(Integer CourseIdSt){
            this.CourseIdSt = CourseIdSt;
            return this;
        }
        public QueryBuilder CourseIdLessEqThan(Integer CourseIdEd){
            this.CourseIdEd = CourseIdEd;
            return this;
        }


        public QueryBuilder CourseId(Integer CourseId){
            setCourseId(CourseId);
            return this;
        }

        public QueryBuilder CourseIdList(Integer ... CourseId){
            this.CourseIdList = solveNullList(CourseId);
            return this;
        }

        public QueryBuilder CourseIdList(List<Integer> CourseId){
            this.CourseIdList = CourseId;
            return this;
        }

        public QueryBuilder fetchCourseId(){
            setFetchFields("fetchFields","CourseId");
            return this;
        }

        public QueryBuilder excludeCourseId(){
            setFetchFields("excludeFields","CourseId");
            return this;
        }

        public QueryBuilder StudentIdBetWeen(Integer StudentIdSt,Integer StudentIdEd){
            this.StudentIdSt = StudentIdSt;
            this.StudentIdEd = StudentIdEd;
            return this;
        }

        public QueryBuilder StudentIdGreaterEqThan(Integer StudentIdSt){
            this.StudentIdSt = StudentIdSt;
            return this;
        }
        public QueryBuilder StudentIdLessEqThan(Integer StudentIdEd){
            this.StudentIdEd = StudentIdEd;
            return this;
        }


        public QueryBuilder StudentId(Integer StudentId){
            setStudentId(StudentId);
            return this;
        }

        public QueryBuilder StudentIdList(Integer ... StudentId){
            this.StudentIdList = solveNullList(StudentId);
            return this;
        }

        public QueryBuilder StudentIdList(List<Integer> StudentId){
            this.StudentIdList = StudentId;
            return this;
        }

        public QueryBuilder fetchStudentId(){
            setFetchFields("fetchFields","StudentId");
            return this;
        }

        public QueryBuilder excludeStudentId(){
            setFetchFields("excludeFields","StudentId");
            return this;
        }

        public QueryBuilder StudentEXPBetWeen(Integer StudentEXPSt,Integer StudentEXPEd){
            this.StudentEXPSt = StudentEXPSt;
            this.StudentEXPEd = StudentEXPEd;
            return this;
        }

        public QueryBuilder StudentEXPGreaterEqThan(Integer StudentEXPSt){
            this.StudentEXPSt = StudentEXPSt;
            return this;
        }
        public QueryBuilder StudentEXPLessEqThan(Integer StudentEXPEd){
            this.StudentEXPEd = StudentEXPEd;
            return this;
        }


        public QueryBuilder StudentEXP(Integer StudentEXP){
            setStudentEXP(StudentEXP);
            return this;
        }

        public QueryBuilder StudentEXPList(Integer ... StudentEXP){
            this.StudentEXPList = solveNullList(StudentEXP);
            return this;
        }

        public QueryBuilder StudentEXPList(List<Integer> StudentEXP){
            this.StudentEXPList = StudentEXP;
            return this;
        }

        public QueryBuilder fetchStudentEXP(){
            setFetchFields("fetchFields","StudentEXP");
            return this;
        }

        public QueryBuilder excludeStudentEXP(){
            setFetchFields("excludeFields","StudentEXP");
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

        public CourseStudent build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<Integer> CourseIdList;

        public List<Integer> getCourseIdList(){return this.CourseIdList;}

        private Integer CourseIdSt;

        private Integer CourseIdEd;

        public Integer getCourseIdSt(){return this.CourseIdSt;}

        public Integer getCourseIdEd(){return this.CourseIdEd;}

        private List<Integer> StudentIdList;

        public List<Integer> getStudentIdList(){return this.StudentIdList;}

        private Integer StudentIdSt;

        private Integer StudentIdEd;

        public Integer getStudentIdSt(){return this.StudentIdSt;}

        public Integer getStudentIdEd(){return this.StudentIdEd;}

        private List<Integer> StudentEXPList;

        public List<Integer> getStudentEXPList(){return this.StudentEXPList;}

        private Integer StudentEXPSt;

        private Integer StudentEXPEd;

        public Integer getStudentEXPSt(){return this.StudentEXPSt;}

        public Integer getStudentEXPEd(){return this.StudentEXPEd;}


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

        public ConditionBuilder CourseIdBetWeen(Integer CourseIdSt,Integer CourseIdEd){
            this.CourseIdSt = CourseIdSt;
            this.CourseIdEd = CourseIdEd;
            return this;
        }

        public ConditionBuilder CourseIdGreaterEqThan(Integer CourseIdSt){
            this.CourseIdSt = CourseIdSt;
            return this;
        }
        public ConditionBuilder CourseIdLessEqThan(Integer CourseIdEd){
            this.CourseIdEd = CourseIdEd;
            return this;
        }


        public ConditionBuilder CourseIdList(Integer ... CourseId){
            this.CourseIdList = solveNullList(CourseId);
            return this;
        }

        public ConditionBuilder CourseIdList(List<Integer> CourseId){
            this.CourseIdList = CourseId;
            return this;
        }

        public ConditionBuilder StudentIdBetWeen(Integer StudentIdSt,Integer StudentIdEd){
            this.StudentIdSt = StudentIdSt;
            this.StudentIdEd = StudentIdEd;
            return this;
        }

        public ConditionBuilder StudentIdGreaterEqThan(Integer StudentIdSt){
            this.StudentIdSt = StudentIdSt;
            return this;
        }
        public ConditionBuilder StudentIdLessEqThan(Integer StudentIdEd){
            this.StudentIdEd = StudentIdEd;
            return this;
        }


        public ConditionBuilder StudentIdList(Integer ... StudentId){
            this.StudentIdList = solveNullList(StudentId);
            return this;
        }

        public ConditionBuilder StudentIdList(List<Integer> StudentId){
            this.StudentIdList = StudentId;
            return this;
        }

        public ConditionBuilder StudentEXPBetWeen(Integer StudentEXPSt,Integer StudentEXPEd){
            this.StudentEXPSt = StudentEXPSt;
            this.StudentEXPEd = StudentEXPEd;
            return this;
        }

        public ConditionBuilder StudentEXPGreaterEqThan(Integer StudentEXPSt){
            this.StudentEXPSt = StudentEXPSt;
            return this;
        }
        public ConditionBuilder StudentEXPLessEqThan(Integer StudentEXPEd){
            this.StudentEXPEd = StudentEXPEd;
            return this;
        }


        public ConditionBuilder StudentEXPList(Integer ... StudentEXP){
            this.StudentEXPList = solveNullList(StudentEXP);
            return this;
        }

        public ConditionBuilder StudentEXPList(List<Integer> StudentEXP){
            this.StudentEXPList = StudentEXP;
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

        private CourseStudent obj;

        public Builder(){
            this.obj = new CourseStudent();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder CourseId(Integer CourseId){
            this.obj.setCourseId(CourseId);
            return this;
        }
        public Builder StudentId(Integer StudentId){
            this.obj.setStudentId(StudentId);
            return this;
        }
        public Builder StudentEXP(Integer StudentEXP){
            this.obj.setStudentEXP(StudentEXP);
            return this;
        }
        public CourseStudent build(){return obj;}
    }

}

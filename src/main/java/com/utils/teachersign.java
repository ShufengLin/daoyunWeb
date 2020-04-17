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
public class teachersign implements Serializable {

    private static final long serialVersionUID = 1587105018508L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer TeacherSignId;

    /**
    * 
    * isNullAble:1
    */
    private Integer TeacherId;

    /**
    * 
    * isNullAble:1
    */
    private Integer CourseId;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime Date;


    public void setTeacherSignId(Integer TeacherSignId){this.TeacherSignId = TeacherSignId;}

    public Integer getTeacherSignId(){return this.TeacherSignId;}

    public void setTeacherId(Integer TeacherId){this.TeacherId = TeacherId;}

    public Integer getTeacherId(){return this.TeacherId;}

    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setDate(java.time.LocalDateTime Date){this.Date = Date;}

    public java.time.LocalDateTime getDate(){return this.Date;}
    @Override
    public String toString() {
        return "teachersign{" +
                "TeacherSignId='" + TeacherSignId + '\'' +
                "TeacherId='" + TeacherId + '\'' +
                "CourseId='" + CourseId + '\'' +
                "Date='" + Date + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private teachersign set;

        private ConditionBuilder where;

        public UpdateBuilder set(teachersign set){
            this.set = set;
            return this;
        }

        public teachersign getSet(){
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

    public static class QueryBuilder extends teachersign{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> TeacherSignIdList;

        public List<Integer> getTeacherSignIdList(){return this.TeacherSignIdList;}

        private Integer TeacherSignIdSt;

        private Integer TeacherSignIdEd;

        public Integer getTeacherSignIdSt(){return this.TeacherSignIdSt;}

        public Integer getTeacherSignIdEd(){return this.TeacherSignIdEd;}

        private List<Integer> TeacherIdList;

        public List<Integer> getTeacherIdList(){return this.TeacherIdList;}

        private Integer TeacherIdSt;

        private Integer TeacherIdEd;

        public Integer getTeacherIdSt(){return this.TeacherIdSt;}

        public Integer getTeacherIdEd(){return this.TeacherIdEd;}

        private List<Integer> CourseIdList;

        public List<Integer> getCourseIdList(){return this.CourseIdList;}

        private Integer CourseIdSt;

        private Integer CourseIdEd;

        public Integer getCourseIdSt(){return this.CourseIdSt;}

        public Integer getCourseIdEd(){return this.CourseIdEd;}

        private List<java.time.LocalDateTime> DateList;

        public List<java.time.LocalDateTime> getDateList(){return this.DateList;}

        private java.time.LocalDateTime DateSt;

        private java.time.LocalDateTime DateEd;

        public java.time.LocalDateTime getDateSt(){return this.DateSt;}

        public java.time.LocalDateTime getDateEd(){return this.DateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder TeacherSignIdBetWeen(Integer TeacherSignIdSt,Integer TeacherSignIdEd){
            this.TeacherSignIdSt = TeacherSignIdSt;
            this.TeacherSignIdEd = TeacherSignIdEd;
            return this;
        }

        public QueryBuilder TeacherSignIdGreaterEqThan(Integer TeacherSignIdSt){
            this.TeacherSignIdSt = TeacherSignIdSt;
            return this;
        }
        public QueryBuilder TeacherSignIdLessEqThan(Integer TeacherSignIdEd){
            this.TeacherSignIdEd = TeacherSignIdEd;
            return this;
        }


        public QueryBuilder TeacherSignId(Integer TeacherSignId){
            setTeacherSignId(TeacherSignId);
            return this;
        }

        public QueryBuilder TeacherSignIdList(Integer ... TeacherSignId){
            this.TeacherSignIdList = solveNullList(TeacherSignId);
            return this;
        }

        public QueryBuilder TeacherSignIdList(List<Integer> TeacherSignId){
            this.TeacherSignIdList = TeacherSignId;
            return this;
        }

        public QueryBuilder fetchTeacherSignId(){
            setFetchFields("fetchFields","TeacherSignId");
            return this;
        }

        public QueryBuilder excludeTeacherSignId(){
            setFetchFields("excludeFields","TeacherSignId");
            return this;
        }

        public QueryBuilder TeacherIdBetWeen(Integer TeacherIdSt,Integer TeacherIdEd){
            this.TeacherIdSt = TeacherIdSt;
            this.TeacherIdEd = TeacherIdEd;
            return this;
        }

        public QueryBuilder TeacherIdGreaterEqThan(Integer TeacherIdSt){
            this.TeacherIdSt = TeacherIdSt;
            return this;
        }
        public QueryBuilder TeacherIdLessEqThan(Integer TeacherIdEd){
            this.TeacherIdEd = TeacherIdEd;
            return this;
        }


        public QueryBuilder TeacherId(Integer TeacherId){
            setTeacherId(TeacherId);
            return this;
        }

        public QueryBuilder TeacherIdList(Integer ... TeacherId){
            this.TeacherIdList = solveNullList(TeacherId);
            return this;
        }

        public QueryBuilder TeacherIdList(List<Integer> TeacherId){
            this.TeacherIdList = TeacherId;
            return this;
        }

        public QueryBuilder fetchTeacherId(){
            setFetchFields("fetchFields","TeacherId");
            return this;
        }

        public QueryBuilder excludeTeacherId(){
            setFetchFields("excludeFields","TeacherId");
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

        public QueryBuilder DateBetWeen(java.time.LocalDateTime DateSt,java.time.LocalDateTime DateEd){
            this.DateSt = DateSt;
            this.DateEd = DateEd;
            return this;
        }

        public QueryBuilder DateGreaterEqThan(java.time.LocalDateTime DateSt){
            this.DateSt = DateSt;
            return this;
        }
        public QueryBuilder DateLessEqThan(java.time.LocalDateTime DateEd){
            this.DateEd = DateEd;
            return this;
        }


        public QueryBuilder Date(java.time.LocalDateTime Date){
            setDate(Date);
            return this;
        }

        public QueryBuilder DateList(java.time.LocalDateTime ... Date){
            this.DateList = solveNullList(Date);
            return this;
        }

        public QueryBuilder DateList(List<java.time.LocalDateTime> Date){
            this.DateList = Date;
            return this;
        }

        public QueryBuilder fetchDate(){
            setFetchFields("fetchFields","Date");
            return this;
        }

        public QueryBuilder excludeDate(){
            setFetchFields("excludeFields","Date");
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

        public teachersign build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> TeacherSignIdList;

        public List<Integer> getTeacherSignIdList(){return this.TeacherSignIdList;}

        private Integer TeacherSignIdSt;

        private Integer TeacherSignIdEd;

        public Integer getTeacherSignIdSt(){return this.TeacherSignIdSt;}

        public Integer getTeacherSignIdEd(){return this.TeacherSignIdEd;}

        private List<Integer> TeacherIdList;

        public List<Integer> getTeacherIdList(){return this.TeacherIdList;}

        private Integer TeacherIdSt;

        private Integer TeacherIdEd;

        public Integer getTeacherIdSt(){return this.TeacherIdSt;}

        public Integer getTeacherIdEd(){return this.TeacherIdEd;}

        private List<Integer> CourseIdList;

        public List<Integer> getCourseIdList(){return this.CourseIdList;}

        private Integer CourseIdSt;

        private Integer CourseIdEd;

        public Integer getCourseIdSt(){return this.CourseIdSt;}

        public Integer getCourseIdEd(){return this.CourseIdEd;}

        private List<java.time.LocalDateTime> DateList;

        public List<java.time.LocalDateTime> getDateList(){return this.DateList;}

        private java.time.LocalDateTime DateSt;

        private java.time.LocalDateTime DateEd;

        public java.time.LocalDateTime getDateSt(){return this.DateSt;}

        public java.time.LocalDateTime getDateEd(){return this.DateEd;}


        public ConditionBuilder TeacherSignIdBetWeen(Integer TeacherSignIdSt,Integer TeacherSignIdEd){
            this.TeacherSignIdSt = TeacherSignIdSt;
            this.TeacherSignIdEd = TeacherSignIdEd;
            return this;
        }

        public ConditionBuilder TeacherSignIdGreaterEqThan(Integer TeacherSignIdSt){
            this.TeacherSignIdSt = TeacherSignIdSt;
            return this;
        }
        public ConditionBuilder TeacherSignIdLessEqThan(Integer TeacherSignIdEd){
            this.TeacherSignIdEd = TeacherSignIdEd;
            return this;
        }


        public ConditionBuilder TeacherSignIdList(Integer ... TeacherSignId){
            this.TeacherSignIdList = solveNullList(TeacherSignId);
            return this;
        }

        public ConditionBuilder TeacherSignIdList(List<Integer> TeacherSignId){
            this.TeacherSignIdList = TeacherSignId;
            return this;
        }

        public ConditionBuilder TeacherIdBetWeen(Integer TeacherIdSt,Integer TeacherIdEd){
            this.TeacherIdSt = TeacherIdSt;
            this.TeacherIdEd = TeacherIdEd;
            return this;
        }

        public ConditionBuilder TeacherIdGreaterEqThan(Integer TeacherIdSt){
            this.TeacherIdSt = TeacherIdSt;
            return this;
        }
        public ConditionBuilder TeacherIdLessEqThan(Integer TeacherIdEd){
            this.TeacherIdEd = TeacherIdEd;
            return this;
        }


        public ConditionBuilder TeacherIdList(Integer ... TeacherId){
            this.TeacherIdList = solveNullList(TeacherId);
            return this;
        }

        public ConditionBuilder TeacherIdList(List<Integer> TeacherId){
            this.TeacherIdList = TeacherId;
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

        public ConditionBuilder DateBetWeen(java.time.LocalDateTime DateSt,java.time.LocalDateTime DateEd){
            this.DateSt = DateSt;
            this.DateEd = DateEd;
            return this;
        }

        public ConditionBuilder DateGreaterEqThan(java.time.LocalDateTime DateSt){
            this.DateSt = DateSt;
            return this;
        }
        public ConditionBuilder DateLessEqThan(java.time.LocalDateTime DateEd){
            this.DateEd = DateEd;
            return this;
        }


        public ConditionBuilder DateList(java.time.LocalDateTime ... Date){
            this.DateList = solveNullList(Date);
            return this;
        }

        public ConditionBuilder DateList(List<java.time.LocalDateTime> Date){
            this.DateList = Date;
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

        private teachersign obj;

        public Builder(){
            this.obj = new teachersign();
        }

        public Builder TeacherSignId(Integer TeacherSignId){
            this.obj.setTeacherSignId(TeacherSignId);
            return this;
        }
        public Builder TeacherId(Integer TeacherId){
            this.obj.setTeacherId(TeacherId);
            return this;
        }
        public Builder CourseId(Integer CourseId){
            this.obj.setCourseId(CourseId);
            return this;
        }
        public Builder Date(java.time.LocalDateTime Date){
            this.obj.setDate(Date);
            return this;
        }
        public teachersign build(){return obj;}
    }

}

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
public class CourseSign implements Serializable {

    private static final long serialVersionUID = 1586522771224L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer SignId;

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
    private String SignPlace;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime SignTime;

    /**
    * 
    * isNullAble:1
    */
    private Integer SignStatus;


    public void setSignId(Integer SignId){this.SignId = SignId;}

    public Integer getSignId(){return this.SignId;}

    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setStudentId(Integer StudentId){this.StudentId = StudentId;}

    public Integer getStudentId(){return this.StudentId;}

    public void setSignPlace(String SignPlace){this.SignPlace = SignPlace;}

    public String getSignPlace(){return this.SignPlace;}

    public void setSignTime(java.time.LocalDateTime SignTime){this.SignTime = SignTime;}

    public java.time.LocalDateTime getSignTime(){return this.SignTime;}

    public void setSignStatus(Integer SignStatus){this.SignStatus = SignStatus;}

    public Integer getSignStatus(){return this.SignStatus;}
    @Override
    public String toString() {
        return "CourseSign{" +
                "SignId='" + SignId + '\'' +
                "CourseId='" + CourseId + '\'' +
                "StudentId='" + StudentId + '\'' +
                "SignPlace='" + SignPlace + '\'' +
                "SignTime='" + SignTime + '\'' +
                "SignStatus='" + SignStatus + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CourseSign set;

        private ConditionBuilder where;

        public UpdateBuilder set(CourseSign set){
            this.set = set;
            return this;
        }

        public CourseSign getSet(){
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

    public static class QueryBuilder extends CourseSign{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> SignIdList;

        public List<Integer> getSignIdList(){return this.SignIdList;}

        private Integer SignIdSt;

        private Integer SignIdEd;

        public Integer getSignIdSt(){return this.SignIdSt;}

        public Integer getSignIdEd(){return this.SignIdEd;}

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

        private List<String> SignPlaceList;

        public List<String> getSignPlaceList(){return this.SignPlaceList;}


        private List<String> fuzzySignPlace;

        public List<String> getFuzzySignPlace(){return this.fuzzySignPlace;}

        private List<String> rightFuzzySignPlace;

        public List<String> getRightFuzzySignPlace(){return this.rightFuzzySignPlace;}
        private List<java.time.LocalDateTime> SignTimeList;

        public List<java.time.LocalDateTime> getSignTimeList(){return this.SignTimeList;}

        private java.time.LocalDateTime SignTimeSt;

        private java.time.LocalDateTime SignTimeEd;

        public java.time.LocalDateTime getSignTimeSt(){return this.SignTimeSt;}

        public java.time.LocalDateTime getSignTimeEd(){return this.SignTimeEd;}

        private List<Integer> SignStatusList;

        public List<Integer> getSignStatusList(){return this.SignStatusList;}

        private Integer SignStatusSt;

        private Integer SignStatusEd;

        public Integer getSignStatusSt(){return this.SignStatusSt;}

        public Integer getSignStatusEd(){return this.SignStatusEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder SignIdBetWeen(Integer SignIdSt,Integer SignIdEd){
            this.SignIdSt = SignIdSt;
            this.SignIdEd = SignIdEd;
            return this;
        }

        public QueryBuilder SignIdGreaterEqThan(Integer SignIdSt){
            this.SignIdSt = SignIdSt;
            return this;
        }
        public QueryBuilder SignIdLessEqThan(Integer SignIdEd){
            this.SignIdEd = SignIdEd;
            return this;
        }


        public QueryBuilder SignId(Integer SignId){
            setSignId(SignId);
            return this;
        }

        public QueryBuilder SignIdList(Integer ... SignId){
            this.SignIdList = solveNullList(SignId);
            return this;
        }

        public QueryBuilder SignIdList(List<Integer> SignId){
            this.SignIdList = SignId;
            return this;
        }

        public QueryBuilder fetchSignId(){
            setFetchFields("fetchFields","SignId");
            return this;
        }

        public QueryBuilder excludeSignId(){
            setFetchFields("excludeFields","SignId");
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

        public QueryBuilder fuzzySignPlace (List<String> fuzzySignPlace){
            this.fuzzySignPlace = fuzzySignPlace;
            return this;
        }

        public QueryBuilder fuzzySignPlace (String ... fuzzySignPlace){
            this.fuzzySignPlace = solveNullList(fuzzySignPlace);
            return this;
        }

        public QueryBuilder rightFuzzySignPlace (List<String> rightFuzzySignPlace){
            this.rightFuzzySignPlace = rightFuzzySignPlace;
            return this;
        }

        public QueryBuilder rightFuzzySignPlace (String ... rightFuzzySignPlace){
            this.rightFuzzySignPlace = solveNullList(rightFuzzySignPlace);
            return this;
        }

        public QueryBuilder SignPlace(String SignPlace){
            setSignPlace(SignPlace);
            return this;
        }

        public QueryBuilder SignPlaceList(String ... SignPlace){
            this.SignPlaceList = solveNullList(SignPlace);
            return this;
        }

        public QueryBuilder SignPlaceList(List<String> SignPlace){
            this.SignPlaceList = SignPlace;
            return this;
        }

        public QueryBuilder fetchSignPlace(){
            setFetchFields("fetchFields","SignPlace");
            return this;
        }

        public QueryBuilder excludeSignPlace(){
            setFetchFields("excludeFields","SignPlace");
            return this;
        }

        public QueryBuilder SignTimeBetWeen(java.time.LocalDateTime SignTimeSt,java.time.LocalDateTime SignTimeEd){
            this.SignTimeSt = SignTimeSt;
            this.SignTimeEd = SignTimeEd;
            return this;
        }

        public QueryBuilder SignTimeGreaterEqThan(java.time.LocalDateTime SignTimeSt){
            this.SignTimeSt = SignTimeSt;
            return this;
        }
        public QueryBuilder SignTimeLessEqThan(java.time.LocalDateTime SignTimeEd){
            this.SignTimeEd = SignTimeEd;
            return this;
        }


        public QueryBuilder SignTime(java.time.LocalDateTime SignTime){
            setSignTime(SignTime);
            return this;
        }

        public QueryBuilder SignTimeList(java.time.LocalDateTime ... SignTime){
            this.SignTimeList = solveNullList(SignTime);
            return this;
        }

        public QueryBuilder SignTimeList(List<java.time.LocalDateTime> SignTime){
            this.SignTimeList = SignTime;
            return this;
        }

        public QueryBuilder fetchSignTime(){
            setFetchFields("fetchFields","SignTime");
            return this;
        }

        public QueryBuilder excludeSignTime(){
            setFetchFields("excludeFields","SignTime");
            return this;
        }

        public QueryBuilder SignStatusBetWeen(Integer SignStatusSt,Integer SignStatusEd){
            this.SignStatusSt = SignStatusSt;
            this.SignStatusEd = SignStatusEd;
            return this;
        }

        public QueryBuilder SignStatusGreaterEqThan(Integer SignStatusSt){
            this.SignStatusSt = SignStatusSt;
            return this;
        }
        public QueryBuilder SignStatusLessEqThan(Integer SignStatusEd){
            this.SignStatusEd = SignStatusEd;
            return this;
        }


        public QueryBuilder SignStatus(Integer SignStatus){
            setSignStatus(SignStatus);
            return this;
        }

        public QueryBuilder SignStatusList(Integer ... SignStatus){
            this.SignStatusList = solveNullList(SignStatus);
            return this;
        }

        public QueryBuilder SignStatusList(List<Integer> SignStatus){
            this.SignStatusList = SignStatus;
            return this;
        }

        public QueryBuilder fetchSignStatus(){
            setFetchFields("fetchFields","SignStatus");
            return this;
        }

        public QueryBuilder excludeSignStatus(){
            setFetchFields("excludeFields","SignStatus");
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

        public CourseSign build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> SignIdList;

        public List<Integer> getSignIdList(){return this.SignIdList;}

        private Integer SignIdSt;

        private Integer SignIdEd;

        public Integer getSignIdSt(){return this.SignIdSt;}

        public Integer getSignIdEd(){return this.SignIdEd;}

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

        private List<String> SignPlaceList;

        public List<String> getSignPlaceList(){return this.SignPlaceList;}


        private List<String> fuzzySignPlace;

        public List<String> getFuzzySignPlace(){return this.fuzzySignPlace;}

        private List<String> rightFuzzySignPlace;

        public List<String> getRightFuzzySignPlace(){return this.rightFuzzySignPlace;}
        private List<java.time.LocalDateTime> SignTimeList;

        public List<java.time.LocalDateTime> getSignTimeList(){return this.SignTimeList;}

        private java.time.LocalDateTime SignTimeSt;

        private java.time.LocalDateTime SignTimeEd;

        public java.time.LocalDateTime getSignTimeSt(){return this.SignTimeSt;}

        public java.time.LocalDateTime getSignTimeEd(){return this.SignTimeEd;}

        private List<Integer> SignStatusList;

        public List<Integer> getSignStatusList(){return this.SignStatusList;}

        private Integer SignStatusSt;

        private Integer SignStatusEd;

        public Integer getSignStatusSt(){return this.SignStatusSt;}

        public Integer getSignStatusEd(){return this.SignStatusEd;}


        public ConditionBuilder SignIdBetWeen(Integer SignIdSt,Integer SignIdEd){
            this.SignIdSt = SignIdSt;
            this.SignIdEd = SignIdEd;
            return this;
        }

        public ConditionBuilder SignIdGreaterEqThan(Integer SignIdSt){
            this.SignIdSt = SignIdSt;
            return this;
        }
        public ConditionBuilder SignIdLessEqThan(Integer SignIdEd){
            this.SignIdEd = SignIdEd;
            return this;
        }


        public ConditionBuilder SignIdList(Integer ... SignId){
            this.SignIdList = solveNullList(SignId);
            return this;
        }

        public ConditionBuilder SignIdList(List<Integer> SignId){
            this.SignIdList = SignId;
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

        public ConditionBuilder fuzzySignPlace (List<String> fuzzySignPlace){
            this.fuzzySignPlace = fuzzySignPlace;
            return this;
        }

        public ConditionBuilder fuzzySignPlace (String ... fuzzySignPlace){
            this.fuzzySignPlace = solveNullList(fuzzySignPlace);
            return this;
        }

        public ConditionBuilder rightFuzzySignPlace (List<String> rightFuzzySignPlace){
            this.rightFuzzySignPlace = rightFuzzySignPlace;
            return this;
        }

        public ConditionBuilder rightFuzzySignPlace (String ... rightFuzzySignPlace){
            this.rightFuzzySignPlace = solveNullList(rightFuzzySignPlace);
            return this;
        }

        public ConditionBuilder SignPlaceList(String ... SignPlace){
            this.SignPlaceList = solveNullList(SignPlace);
            return this;
        }

        public ConditionBuilder SignPlaceList(List<String> SignPlace){
            this.SignPlaceList = SignPlace;
            return this;
        }

        public ConditionBuilder SignTimeBetWeen(java.time.LocalDateTime SignTimeSt,java.time.LocalDateTime SignTimeEd){
            this.SignTimeSt = SignTimeSt;
            this.SignTimeEd = SignTimeEd;
            return this;
        }

        public ConditionBuilder SignTimeGreaterEqThan(java.time.LocalDateTime SignTimeSt){
            this.SignTimeSt = SignTimeSt;
            return this;
        }
        public ConditionBuilder SignTimeLessEqThan(java.time.LocalDateTime SignTimeEd){
            this.SignTimeEd = SignTimeEd;
            return this;
        }


        public ConditionBuilder SignTimeList(java.time.LocalDateTime ... SignTime){
            this.SignTimeList = solveNullList(SignTime);
            return this;
        }

        public ConditionBuilder SignTimeList(List<java.time.LocalDateTime> SignTime){
            this.SignTimeList = SignTime;
            return this;
        }

        public ConditionBuilder SignStatusBetWeen(Integer SignStatusSt,Integer SignStatusEd){
            this.SignStatusSt = SignStatusSt;
            this.SignStatusEd = SignStatusEd;
            return this;
        }

        public ConditionBuilder SignStatusGreaterEqThan(Integer SignStatusSt){
            this.SignStatusSt = SignStatusSt;
            return this;
        }
        public ConditionBuilder SignStatusLessEqThan(Integer SignStatusEd){
            this.SignStatusEd = SignStatusEd;
            return this;
        }


        public ConditionBuilder SignStatusList(Integer ... SignStatus){
            this.SignStatusList = solveNullList(SignStatus);
            return this;
        }

        public ConditionBuilder SignStatusList(List<Integer> SignStatus){
            this.SignStatusList = SignStatus;
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

        private CourseSign obj;

        public Builder(){
            this.obj = new CourseSign();
        }

        public Builder SignId(Integer SignId){
            this.obj.setSignId(SignId);
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
        public Builder SignPlace(String SignPlace){
            this.obj.setSignPlace(SignPlace);
            return this;
        }
        public Builder SignTime(java.time.LocalDateTime SignTime){
            this.obj.setSignTime(SignTime);
            return this;
        }
        public Builder SignStatus(Integer SignStatus){
            this.obj.setSignStatus(SignStatus);
            return this;
        }
        public CourseSign build(){return obj;}
    }

}

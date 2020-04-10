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
public class course implements Serializable {

    private static final long serialVersionUID = 1586522728755L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer CourseId;

    /**
    * 
    * isNullAble:1
    */
    private String CourseName;

    /**
    * 
    * isNullAble:1
    */
    private Integer CourseHour;

    /**
    * 
    * isNullAble:0
    */
    private Integer TeachId;

    /**
    * 
    * isNullAble:1
    */
    private String CoursePlace;


    public void setCourseId(Integer CourseId){this.CourseId = CourseId;}

    public Integer getCourseId(){return this.CourseId;}

    public void setCourseName(String CourseName){this.CourseName = CourseName;}

    public String getCourseName(){return this.CourseName;}

    public void setCourseHour(Integer CourseHour){this.CourseHour = CourseHour;}

    public Integer getCourseHour(){return this.CourseHour;}

    public void setTeachId(Integer TeachId){this.TeachId = TeachId;}

    public Integer getTeachId(){return this.TeachId;}

    public void setCoursePlace(String CoursePlace){this.CoursePlace = CoursePlace;}

    public String getCoursePlace(){return this.CoursePlace;}
    @Override
    public String toString() {
        return "course{" +
                "CourseId='" + CourseId + '\'' +
                "CourseName='" + CourseName + '\'' +
                "CourseHour='" + CourseHour + '\'' +
                "TeachId='" + TeachId + '\'' +
                "CoursePlace='" + CoursePlace + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private course set;

        private ConditionBuilder where;

        public UpdateBuilder set(course set){
            this.set = set;
            return this;
        }

        public course getSet(){
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

    public static class QueryBuilder extends course{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> CourseIdList;

        public List<Integer> getCourseIdList(){return this.CourseIdList;}

        private Integer CourseIdSt;

        private Integer CourseIdEd;

        public Integer getCourseIdSt(){return this.CourseIdSt;}

        public Integer getCourseIdEd(){return this.CourseIdEd;}

        private List<String> CourseNameList;

        public List<String> getCourseNameList(){return this.CourseNameList;}


        private List<String> fuzzyCourseName;

        public List<String> getFuzzyCourseName(){return this.fuzzyCourseName;}

        private List<String> rightFuzzyCourseName;

        public List<String> getRightFuzzyCourseName(){return this.rightFuzzyCourseName;}
        private List<Integer> CourseHourList;

        public List<Integer> getCourseHourList(){return this.CourseHourList;}

        private Integer CourseHourSt;

        private Integer CourseHourEd;

        public Integer getCourseHourSt(){return this.CourseHourSt;}

        public Integer getCourseHourEd(){return this.CourseHourEd;}

        private List<Integer> TeachIdList;

        public List<Integer> getTeachIdList(){return this.TeachIdList;}

        private Integer TeachIdSt;

        private Integer TeachIdEd;

        public Integer getTeachIdSt(){return this.TeachIdSt;}

        public Integer getTeachIdEd(){return this.TeachIdEd;}

        private List<String> CoursePlaceList;

        public List<String> getCoursePlaceList(){return this.CoursePlaceList;}


        private List<String> fuzzyCoursePlace;

        public List<String> getFuzzyCoursePlace(){return this.fuzzyCoursePlace;}

        private List<String> rightFuzzyCoursePlace;

        public List<String> getRightFuzzyCoursePlace(){return this.rightFuzzyCoursePlace;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyCourseName (List<String> fuzzyCourseName){
            this.fuzzyCourseName = fuzzyCourseName;
            return this;
        }

        public QueryBuilder fuzzyCourseName (String ... fuzzyCourseName){
            this.fuzzyCourseName = solveNullList(fuzzyCourseName);
            return this;
        }

        public QueryBuilder rightFuzzyCourseName (List<String> rightFuzzyCourseName){
            this.rightFuzzyCourseName = rightFuzzyCourseName;
            return this;
        }

        public QueryBuilder rightFuzzyCourseName (String ... rightFuzzyCourseName){
            this.rightFuzzyCourseName = solveNullList(rightFuzzyCourseName);
            return this;
        }

        public QueryBuilder CourseName(String CourseName){
            setCourseName(CourseName);
            return this;
        }

        public QueryBuilder CourseNameList(String ... CourseName){
            this.CourseNameList = solveNullList(CourseName);
            return this;
        }

        public QueryBuilder CourseNameList(List<String> CourseName){
            this.CourseNameList = CourseName;
            return this;
        }

        public QueryBuilder fetchCourseName(){
            setFetchFields("fetchFields","CourseName");
            return this;
        }

        public QueryBuilder excludeCourseName(){
            setFetchFields("excludeFields","CourseName");
            return this;
        }

        public QueryBuilder CourseHourBetWeen(Integer CourseHourSt,Integer CourseHourEd){
            this.CourseHourSt = CourseHourSt;
            this.CourseHourEd = CourseHourEd;
            return this;
        }

        public QueryBuilder CourseHourGreaterEqThan(Integer CourseHourSt){
            this.CourseHourSt = CourseHourSt;
            return this;
        }
        public QueryBuilder CourseHourLessEqThan(Integer CourseHourEd){
            this.CourseHourEd = CourseHourEd;
            return this;
        }


        public QueryBuilder CourseHour(Integer CourseHour){
            setCourseHour(CourseHour);
            return this;
        }

        public QueryBuilder CourseHourList(Integer ... CourseHour){
            this.CourseHourList = solveNullList(CourseHour);
            return this;
        }

        public QueryBuilder CourseHourList(List<Integer> CourseHour){
            this.CourseHourList = CourseHour;
            return this;
        }

        public QueryBuilder fetchCourseHour(){
            setFetchFields("fetchFields","CourseHour");
            return this;
        }

        public QueryBuilder excludeCourseHour(){
            setFetchFields("excludeFields","CourseHour");
            return this;
        }

        public QueryBuilder TeachIdBetWeen(Integer TeachIdSt,Integer TeachIdEd){
            this.TeachIdSt = TeachIdSt;
            this.TeachIdEd = TeachIdEd;
            return this;
        }

        public QueryBuilder TeachIdGreaterEqThan(Integer TeachIdSt){
            this.TeachIdSt = TeachIdSt;
            return this;
        }
        public QueryBuilder TeachIdLessEqThan(Integer TeachIdEd){
            this.TeachIdEd = TeachIdEd;
            return this;
        }


        public QueryBuilder TeachId(Integer TeachId){
            setTeachId(TeachId);
            return this;
        }

        public QueryBuilder TeachIdList(Integer ... TeachId){
            this.TeachIdList = solveNullList(TeachId);
            return this;
        }

        public QueryBuilder TeachIdList(List<Integer> TeachId){
            this.TeachIdList = TeachId;
            return this;
        }

        public QueryBuilder fetchTeachId(){
            setFetchFields("fetchFields","TeachId");
            return this;
        }

        public QueryBuilder excludeTeachId(){
            setFetchFields("excludeFields","TeachId");
            return this;
        }

        public QueryBuilder fuzzyCoursePlace (List<String> fuzzyCoursePlace){
            this.fuzzyCoursePlace = fuzzyCoursePlace;
            return this;
        }

        public QueryBuilder fuzzyCoursePlace (String ... fuzzyCoursePlace){
            this.fuzzyCoursePlace = solveNullList(fuzzyCoursePlace);
            return this;
        }

        public QueryBuilder rightFuzzyCoursePlace (List<String> rightFuzzyCoursePlace){
            this.rightFuzzyCoursePlace = rightFuzzyCoursePlace;
            return this;
        }

        public QueryBuilder rightFuzzyCoursePlace (String ... rightFuzzyCoursePlace){
            this.rightFuzzyCoursePlace = solveNullList(rightFuzzyCoursePlace);
            return this;
        }

        public QueryBuilder CoursePlace(String CoursePlace){
            setCoursePlace(CoursePlace);
            return this;
        }

        public QueryBuilder CoursePlaceList(String ... CoursePlace){
            this.CoursePlaceList = solveNullList(CoursePlace);
            return this;
        }

        public QueryBuilder CoursePlaceList(List<String> CoursePlace){
            this.CoursePlaceList = CoursePlace;
            return this;
        }

        public QueryBuilder fetchCoursePlace(){
            setFetchFields("fetchFields","CoursePlace");
            return this;
        }

        public QueryBuilder excludeCoursePlace(){
            setFetchFields("excludeFields","CoursePlace");
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

        public course build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> CourseIdList;

        public List<Integer> getCourseIdList(){return this.CourseIdList;}

        private Integer CourseIdSt;

        private Integer CourseIdEd;

        public Integer getCourseIdSt(){return this.CourseIdSt;}

        public Integer getCourseIdEd(){return this.CourseIdEd;}

        private List<String> CourseNameList;

        public List<String> getCourseNameList(){return this.CourseNameList;}


        private List<String> fuzzyCourseName;

        public List<String> getFuzzyCourseName(){return this.fuzzyCourseName;}

        private List<String> rightFuzzyCourseName;

        public List<String> getRightFuzzyCourseName(){return this.rightFuzzyCourseName;}
        private List<Integer> CourseHourList;

        public List<Integer> getCourseHourList(){return this.CourseHourList;}

        private Integer CourseHourSt;

        private Integer CourseHourEd;

        public Integer getCourseHourSt(){return this.CourseHourSt;}

        public Integer getCourseHourEd(){return this.CourseHourEd;}

        private List<Integer> TeachIdList;

        public List<Integer> getTeachIdList(){return this.TeachIdList;}

        private Integer TeachIdSt;

        private Integer TeachIdEd;

        public Integer getTeachIdSt(){return this.TeachIdSt;}

        public Integer getTeachIdEd(){return this.TeachIdEd;}

        private List<String> CoursePlaceList;

        public List<String> getCoursePlaceList(){return this.CoursePlaceList;}


        private List<String> fuzzyCoursePlace;

        public List<String> getFuzzyCoursePlace(){return this.fuzzyCoursePlace;}

        private List<String> rightFuzzyCoursePlace;

        public List<String> getRightFuzzyCoursePlace(){return this.rightFuzzyCoursePlace;}

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

        public ConditionBuilder fuzzyCourseName (List<String> fuzzyCourseName){
            this.fuzzyCourseName = fuzzyCourseName;
            return this;
        }

        public ConditionBuilder fuzzyCourseName (String ... fuzzyCourseName){
            this.fuzzyCourseName = solveNullList(fuzzyCourseName);
            return this;
        }

        public ConditionBuilder rightFuzzyCourseName (List<String> rightFuzzyCourseName){
            this.rightFuzzyCourseName = rightFuzzyCourseName;
            return this;
        }

        public ConditionBuilder rightFuzzyCourseName (String ... rightFuzzyCourseName){
            this.rightFuzzyCourseName = solveNullList(rightFuzzyCourseName);
            return this;
        }

        public ConditionBuilder CourseNameList(String ... CourseName){
            this.CourseNameList = solveNullList(CourseName);
            return this;
        }

        public ConditionBuilder CourseNameList(List<String> CourseName){
            this.CourseNameList = CourseName;
            return this;
        }

        public ConditionBuilder CourseHourBetWeen(Integer CourseHourSt,Integer CourseHourEd){
            this.CourseHourSt = CourseHourSt;
            this.CourseHourEd = CourseHourEd;
            return this;
        }

        public ConditionBuilder CourseHourGreaterEqThan(Integer CourseHourSt){
            this.CourseHourSt = CourseHourSt;
            return this;
        }
        public ConditionBuilder CourseHourLessEqThan(Integer CourseHourEd){
            this.CourseHourEd = CourseHourEd;
            return this;
        }


        public ConditionBuilder CourseHourList(Integer ... CourseHour){
            this.CourseHourList = solveNullList(CourseHour);
            return this;
        }

        public ConditionBuilder CourseHourList(List<Integer> CourseHour){
            this.CourseHourList = CourseHour;
            return this;
        }

        public ConditionBuilder TeachIdBetWeen(Integer TeachIdSt,Integer TeachIdEd){
            this.TeachIdSt = TeachIdSt;
            this.TeachIdEd = TeachIdEd;
            return this;
        }

        public ConditionBuilder TeachIdGreaterEqThan(Integer TeachIdSt){
            this.TeachIdSt = TeachIdSt;
            return this;
        }
        public ConditionBuilder TeachIdLessEqThan(Integer TeachIdEd){
            this.TeachIdEd = TeachIdEd;
            return this;
        }


        public ConditionBuilder TeachIdList(Integer ... TeachId){
            this.TeachIdList = solveNullList(TeachId);
            return this;
        }

        public ConditionBuilder TeachIdList(List<Integer> TeachId){
            this.TeachIdList = TeachId;
            return this;
        }

        public ConditionBuilder fuzzyCoursePlace (List<String> fuzzyCoursePlace){
            this.fuzzyCoursePlace = fuzzyCoursePlace;
            return this;
        }

        public ConditionBuilder fuzzyCoursePlace (String ... fuzzyCoursePlace){
            this.fuzzyCoursePlace = solveNullList(fuzzyCoursePlace);
            return this;
        }

        public ConditionBuilder rightFuzzyCoursePlace (List<String> rightFuzzyCoursePlace){
            this.rightFuzzyCoursePlace = rightFuzzyCoursePlace;
            return this;
        }

        public ConditionBuilder rightFuzzyCoursePlace (String ... rightFuzzyCoursePlace){
            this.rightFuzzyCoursePlace = solveNullList(rightFuzzyCoursePlace);
            return this;
        }

        public ConditionBuilder CoursePlaceList(String ... CoursePlace){
            this.CoursePlaceList = solveNullList(CoursePlace);
            return this;
        }

        public ConditionBuilder CoursePlaceList(List<String> CoursePlace){
            this.CoursePlaceList = CoursePlace;
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

        private course obj;

        public Builder(){
            this.obj = new course();
        }

        public Builder CourseId(Integer CourseId){
            this.obj.setCourseId(CourseId);
            return this;
        }
        public Builder CourseName(String CourseName){
            this.obj.setCourseName(CourseName);
            return this;
        }
        public Builder CourseHour(Integer CourseHour){
            this.obj.setCourseHour(CourseHour);
            return this;
        }
        public Builder TeachId(Integer TeachId){
            this.obj.setTeachId(TeachId);
            return this;
        }
        public Builder CoursePlace(String CoursePlace){
            this.obj.setCoursePlace(CoursePlace);
            return this;
        }
        public course build(){return obj;}
    }

}

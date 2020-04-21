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
public class user implements Serializable {

    private static final long serialVersionUID = 1586522786098L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer UserId;

    /**
    * 
    * isNullAble:1
    */
    private String UserName;

    /**
    * 
    * isNullAble:1
    */
    private String UserEducation;

    /**
    * 
    * isNullAble:1
    */
    private String PhoneNumber;

    /**
    * 
    * isNullAble:1
    */
    private String Password;

    /**
    * 
    * isNullAble:1
    */
    private String School;

    /**
    * 
    * isNullAble:1
    */
    private String Academy;

    /**
    * 
    * isNullAble:1
    */
    private String Major;


    public void setUserId(Integer UserId){this.UserId = UserId;}

    public Integer getUserId(){return this.UserId;}

    public void setUserName(String UserName){this.UserName = UserName;}

    public String getUserName(){return this.UserName;}

    public void setUserEducation(String UserEducation){this.UserEducation = UserEducation;}

    public String getUserEducation(){return this.UserEducation;}

    public void setPhoneNumber(String PhoneNumber){this.PhoneNumber = PhoneNumber;}

    public String getPhoneNumber(){return this.PhoneNumber;}

    public void setPassword(String Password){this.Password = Password;}

    public String getPassword(){return this.Password;}

    public void setSchool(String School){this.School = School;}

    public String getSchool(){return this.School;}

    public void setAcademy(String Academy){this.Academy = Academy;}

    public String getAcademy(){return this.Academy;}

    public void setMajor(String Major){this.Major = Major;}

    public String getMajor(){return this.Major;}
    @Override
    public String toString() {
        return "user{" +
                "UserId='" + UserId + '\'' +
                "UserName='" + UserName + '\'' +
                "UserEducation='" + UserEducation + '\'' +
                "PhoneNumber='" + PhoneNumber + '\'' +
                "Password='" + Password + '\'' +
                "School='" + School + '\'' +
                "Academy='" + Academy + '\'' +
                "Major='" + Major + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private user set;

        private ConditionBuilder where;

        public UpdateBuilder set(user set){
            this.set = set;
            return this;
        }

        public user getSet(){
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

    public static class QueryBuilder extends user{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> UserIdList;

        public List<Integer> getUserIdList(){return this.UserIdList;}

        private Integer UserIdSt;

        private Integer UserIdEd;

        public Integer getUserIdSt(){return this.UserIdSt;}

        public Integer getUserIdEd(){return this.UserIdEd;}

        private List<String> UserNameList;

        public List<String> getUserNameList(){return this.UserNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> UserEducationList;

        public List<String> getUserEducationList(){return this.UserEducationList;}


        private List<String> fuzzyUserEducation;

        public List<String> getFuzzyUserEducation(){return this.fuzzyUserEducation;}

        private List<String> rightFuzzyUserEducation;

        public List<String> getRightFuzzyUserEducation(){return this.rightFuzzyUserEducation;}
        private List<String> PhoneNumberList;

        public List<String> getPhoneNumberList(){return this.PhoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
        private List<String> PasswordList;

        public List<String> getPasswordList(){return this.PasswordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> SchoolList;

        public List<String> getSchoolList(){return this.SchoolList;}


        private List<String> fuzzySchool;

        public List<String> getFuzzySchool(){return this.fuzzySchool;}

        private List<String> rightFuzzySchool;

        public List<String> getRightFuzzySchool(){return this.rightFuzzySchool;}
        private List<String> AcademyList;

        public List<String> getAcademyList(){return this.AcademyList;}


        private List<String> fuzzyAcademy;

        public List<String> getFuzzyAcademy(){return this.fuzzyAcademy;}

        private List<String> rightFuzzyAcademy;

        public List<String> getRightFuzzyAcademy(){return this.rightFuzzyAcademy;}
        private List<String> MajorList;

        public List<String> getMajorList(){return this.MajorList;}


        private List<String> fuzzyMajor;

        public List<String> getFuzzyMajor(){return this.fuzzyMajor;}

        private List<String> rightFuzzyMajor;

        public List<String> getRightFuzzyMajor(){return this.rightFuzzyMajor;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder UserName(String UserName){
            setUserName(UserName);
            return this;
        }

        public QueryBuilder UserNameList(String ... UserName){
            this.UserNameList = solveNullList(UserName);
            return this;
        }

        public QueryBuilder UserNameList(List<String> UserName){
            this.UserNameList = UserName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","UserName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","UserName");
            return this;
        }

        public QueryBuilder fuzzyUserEducation (List<String> fuzzyUserEducation){
            this.fuzzyUserEducation = fuzzyUserEducation;
            return this;
        }

        public QueryBuilder fuzzyUserEducation (String ... fuzzyUserEducation){
            this.fuzzyUserEducation = solveNullList(fuzzyUserEducation);
            return this;
        }

        public QueryBuilder rightFuzzyUserEducation (List<String> rightFuzzyUserEducation){
            this.rightFuzzyUserEducation = rightFuzzyUserEducation;
            return this;
        }

        public QueryBuilder rightFuzzyUserEducation (String ... rightFuzzyUserEducation){
            this.rightFuzzyUserEducation = solveNullList(rightFuzzyUserEducation);
            return this;
        }

        public QueryBuilder UserEducation(String UserEducation){
            setUserEducation(UserEducation);
            return this;
        }

        public QueryBuilder UserEducationList(String ... UserEducation){
            this.UserEducationList = solveNullList(UserEducation);
            return this;
        }

        public QueryBuilder UserEducationList(List<String> UserEducation){
            this.UserEducationList = UserEducation;
            return this;
        }

        public QueryBuilder fetchUserEducation(){
            setFetchFields("fetchFields","UserEducation");
            return this;
        }

        public QueryBuilder excludeUserEducation(){
            setFetchFields("excludeFields","UserEducation");
            return this;
        }

        public QueryBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder PhoneNumber(String PhoneNumber){
            setPhoneNumber(PhoneNumber);
            return this;
        }

        public QueryBuilder PhoneNumberList(String ... PhoneNumber){
            this.PhoneNumberList = solveNullList(PhoneNumber);
            return this;
        }

        public QueryBuilder PhoneNumberList(List<String> PhoneNumber){
            this.PhoneNumberList = PhoneNumber;
            return this;
        }

        public QueryBuilder fetchPhoneNumber(){
            setFetchFields("fetchFields","PhoneNumber");
            return this;
        }

        public QueryBuilder excludePhoneNumber(){
            setFetchFields("excludeFields","PhoneNumber");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder Password(String Password){
            setPassword(Password);
            return this;
        }

        public QueryBuilder PasswordList(String ... Password){
            this.PasswordList = solveNullList(Password);
            return this;
        }

        public QueryBuilder PasswordList(List<String> Password){
            this.PasswordList = Password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","Password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","Password");
            return this;
        }

        public QueryBuilder fuzzySchool (List<String> fuzzySchool){
            this.fuzzySchool = fuzzySchool;
            return this;
        }

        public QueryBuilder fuzzySchool (String ... fuzzySchool){
            this.fuzzySchool = solveNullList(fuzzySchool);
            return this;
        }

        public QueryBuilder rightFuzzySchool (List<String> rightFuzzySchool){
            this.rightFuzzySchool = rightFuzzySchool;
            return this;
        }

        public QueryBuilder rightFuzzySchool (String ... rightFuzzySchool){
            this.rightFuzzySchool = solveNullList(rightFuzzySchool);
            return this;
        }

        public QueryBuilder School(String School){
            setSchool(School);
            return this;
        }

        public QueryBuilder SchoolList(String ... School){
            this.SchoolList = solveNullList(School);
            return this;
        }

        public QueryBuilder SchoolList(List<String> School){
            this.SchoolList = School;
            return this;
        }

        public QueryBuilder fetchSchool(){
            setFetchFields("fetchFields","School");
            return this;
        }

        public QueryBuilder excludeSchool(){
            setFetchFields("excludeFields","School");
            return this;
        }

        public QueryBuilder fuzzyAcademy (List<String> fuzzyAcademy){
            this.fuzzyAcademy = fuzzyAcademy;
            return this;
        }

        public QueryBuilder fuzzyAcademy (String ... fuzzyAcademy){
            this.fuzzyAcademy = solveNullList(fuzzyAcademy);
            return this;
        }

        public QueryBuilder rightFuzzyAcademy (List<String> rightFuzzyAcademy){
            this.rightFuzzyAcademy = rightFuzzyAcademy;
            return this;
        }

        public QueryBuilder rightFuzzyAcademy (String ... rightFuzzyAcademy){
            this.rightFuzzyAcademy = solveNullList(rightFuzzyAcademy);
            return this;
        }

        public QueryBuilder Academy(String Academy){
            setAcademy(Academy);
            return this;
        }

        public QueryBuilder AcademyList(String ... Academy){
            this.AcademyList = solveNullList(Academy);
            return this;
        }

        public QueryBuilder AcademyList(List<String> Academy){
            this.AcademyList = Academy;
            return this;
        }

        public QueryBuilder fetchAcademy(){
            setFetchFields("fetchFields","Academy");
            return this;
        }

        public QueryBuilder excludeAcademy(){
            setFetchFields("excludeFields","Academy");
            return this;
        }

        public QueryBuilder fuzzyMajor (List<String> fuzzyMajor){
            this.fuzzyMajor = fuzzyMajor;
            return this;
        }

        public QueryBuilder fuzzyMajor (String ... fuzzyMajor){
            this.fuzzyMajor = solveNullList(fuzzyMajor);
            return this;
        }

        public QueryBuilder rightFuzzyMajor (List<String> rightFuzzyMajor){
            this.rightFuzzyMajor = rightFuzzyMajor;
            return this;
        }

        public QueryBuilder rightFuzzyMajor (String ... rightFuzzyMajor){
            this.rightFuzzyMajor = solveNullList(rightFuzzyMajor);
            return this;
        }

        public QueryBuilder Major(String Major){
            setMajor(Major);
            return this;
        }

        public QueryBuilder MajorList(String ... Major){
            this.MajorList = solveNullList(Major);
            return this;
        }

        public QueryBuilder MajorList(List<String> Major){
            this.MajorList = Major;
            return this;
        }

        public QueryBuilder fetchMajor(){
            setFetchFields("fetchFields","Major");
            return this;
        }

        public QueryBuilder excludeMajor(){
            setFetchFields("excludeFields","Major");
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

        public user build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> UserIdList;

        public List<Integer> getUserIdList(){return this.UserIdList;}

        private Integer UserIdSt;

        private Integer UserIdEd;

        public Integer getUserIdSt(){return this.UserIdSt;}

        public Integer getUserIdEd(){return this.UserIdEd;}

        private List<String> UserNameList;

        public List<String> getUserNameList(){return this.UserNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> UserEducationList;

        public List<String> getUserEducationList(){return this.UserEducationList;}


        private List<String> fuzzyUserEducation;

        public List<String> getFuzzyUserEducation(){return this.fuzzyUserEducation;}

        private List<String> rightFuzzyUserEducation;

        public List<String> getRightFuzzyUserEducation(){return this.rightFuzzyUserEducation;}
        private List<String> PhoneNumberList;

        public List<String> getPhoneNumberList(){return this.PhoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
        private List<String> PasswordList;

        public List<String> getPasswordList(){return this.PasswordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> SchoolList;

        public List<String> getSchoolList(){return this.SchoolList;}


        private List<String> fuzzySchool;

        public List<String> getFuzzySchool(){return this.fuzzySchool;}

        private List<String> rightFuzzySchool;

        public List<String> getRightFuzzySchool(){return this.rightFuzzySchool;}
        private List<String> AcademyList;

        public List<String> getAcademyList(){return this.AcademyList;}


        private List<String> fuzzyAcademy;

        public List<String> getFuzzyAcademy(){return this.fuzzyAcademy;}

        private List<String> rightFuzzyAcademy;

        public List<String> getRightFuzzyAcademy(){return this.rightFuzzyAcademy;}
        private List<String> MajorList;

        public List<String> getMajorList(){return this.MajorList;}


        private List<String> fuzzyMajor;

        public List<String> getFuzzyMajor(){return this.fuzzyMajor;}

        private List<String> rightFuzzyMajor;

        public List<String> getRightFuzzyMajor(){return this.rightFuzzyMajor;}

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

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder UserNameList(String ... UserName){
            this.UserNameList = solveNullList(UserName);
            return this;
        }

        public ConditionBuilder UserNameList(List<String> UserName){
            this.UserNameList = UserName;
            return this;
        }

        public ConditionBuilder fuzzyUserEducation (List<String> fuzzyUserEducation){
            this.fuzzyUserEducation = fuzzyUserEducation;
            return this;
        }

        public ConditionBuilder fuzzyUserEducation (String ... fuzzyUserEducation){
            this.fuzzyUserEducation = solveNullList(fuzzyUserEducation);
            return this;
        }

        public ConditionBuilder rightFuzzyUserEducation (List<String> rightFuzzyUserEducation){
            this.rightFuzzyUserEducation = rightFuzzyUserEducation;
            return this;
        }

        public ConditionBuilder rightFuzzyUserEducation (String ... rightFuzzyUserEducation){
            this.rightFuzzyUserEducation = solveNullList(rightFuzzyUserEducation);
            return this;
        }

        public ConditionBuilder UserEducationList(String ... UserEducation){
            this.UserEducationList = solveNullList(UserEducation);
            return this;
        }

        public ConditionBuilder UserEducationList(List<String> UserEducation){
            this.UserEducationList = UserEducation;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder PhoneNumberList(String ... PhoneNumber){
            this.PhoneNumberList = solveNullList(PhoneNumber);
            return this;
        }

        public ConditionBuilder PhoneNumberList(List<String> PhoneNumber){
            this.PhoneNumberList = PhoneNumber;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder PasswordList(String ... Password){
            this.PasswordList = solveNullList(Password);
            return this;
        }

        public ConditionBuilder PasswordList(List<String> Password){
            this.PasswordList = Password;
            return this;
        }

        public ConditionBuilder fuzzySchool (List<String> fuzzySchool){
            this.fuzzySchool = fuzzySchool;
            return this;
        }

        public ConditionBuilder fuzzySchool (String ... fuzzySchool){
            this.fuzzySchool = solveNullList(fuzzySchool);
            return this;
        }

        public ConditionBuilder rightFuzzySchool (List<String> rightFuzzySchool){
            this.rightFuzzySchool = rightFuzzySchool;
            return this;
        }

        public ConditionBuilder rightFuzzySchool (String ... rightFuzzySchool){
            this.rightFuzzySchool = solveNullList(rightFuzzySchool);
            return this;
        }

        public ConditionBuilder SchoolList(String ... School){
            this.SchoolList = solveNullList(School);
            return this;
        }

        public ConditionBuilder SchoolList(List<String> School){
            this.SchoolList = School;
            return this;
        }

        public ConditionBuilder fuzzyAcademy (List<String> fuzzyAcademy){
            this.fuzzyAcademy = fuzzyAcademy;
            return this;
        }

        public ConditionBuilder fuzzyAcademy (String ... fuzzyAcademy){
            this.fuzzyAcademy = solveNullList(fuzzyAcademy);
            return this;
        }

        public ConditionBuilder rightFuzzyAcademy (List<String> rightFuzzyAcademy){
            this.rightFuzzyAcademy = rightFuzzyAcademy;
            return this;
        }

        public ConditionBuilder rightFuzzyAcademy (String ... rightFuzzyAcademy){
            this.rightFuzzyAcademy = solveNullList(rightFuzzyAcademy);
            return this;
        }

        public ConditionBuilder AcademyList(String ... Academy){
            this.AcademyList = solveNullList(Academy);
            return this;
        }

        public ConditionBuilder AcademyList(List<String> Academy){
            this.AcademyList = Academy;
            return this;
        }

        public ConditionBuilder fuzzyMajor (List<String> fuzzyMajor){
            this.fuzzyMajor = fuzzyMajor;
            return this;
        }

        public ConditionBuilder fuzzyMajor (String ... fuzzyMajor){
            this.fuzzyMajor = solveNullList(fuzzyMajor);
            return this;
        }

        public ConditionBuilder rightFuzzyMajor (List<String> rightFuzzyMajor){
            this.rightFuzzyMajor = rightFuzzyMajor;
            return this;
        }

        public ConditionBuilder rightFuzzyMajor (String ... rightFuzzyMajor){
            this.rightFuzzyMajor = solveNullList(rightFuzzyMajor);
            return this;
        }

        public ConditionBuilder MajorList(String ... Major){
            this.MajorList = solveNullList(Major);
            return this;
        }

        public ConditionBuilder MajorList(List<String> Major){
            this.MajorList = Major;
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

        private user obj;

        public Builder(){
            this.obj = new user();
        }

        public Builder UserId(Integer UserId){
            this.obj.setUserId(UserId);
            return this;
        }
        public Builder UserName(String UserName){
            this.obj.setUserName(UserName);
            return this;
        }
        public Builder UserEducation(String UserEducation){
            this.obj.setUserEducation(UserEducation);
            return this;
        }
        public Builder PhoneNumber(String PhoneNumber){
            this.obj.setPhoneNumber(PhoneNumber);
            return this;
        }
        public Builder Password(String Password){
            this.obj.setPassword(Password);
            return this;
        }
        public Builder School(String School){
            this.obj.setSchool(School);
            return this;
        }
        public Builder Academy(String Academy){
            this.obj.setAcademy(Academy);
            return this;
        }
        public Builder Major(String Major){
            this.obj.setMajor(Major);
            return this;
        }
        public user build(){return obj;}
    }

}

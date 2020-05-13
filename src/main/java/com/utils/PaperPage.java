package com.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.utils.json.PaperPageDeserializer;

@JsonDeserialize(using = PaperPageDeserializer.class)
public class PaperPage {
    private int pageSize;//一页的数据条目个数
    private int page;//页码
    private int beginPage;//根据页码换算得出的条目起始个数

    private long paperId;
    private String paperName;

    private long courseId;
    private String courseName;

    private long userId;
    private String userName;

    private long roleId;
    private String roleName;

    public PaperPage(){

    }

    public PaperPage(int page,int pageSize){
        this.page = page;
        this.pageSize = pageSize;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public long getPaperId() { return paperId; }

    public void setPaperId(long paperId) { this.paperId = paperId; }

    public String getPaperName() { return paperName; }

    public void setPaperName(String paperName) { this.paperName = paperName; }


    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

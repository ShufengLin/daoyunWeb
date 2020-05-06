package com.utils;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.utils.json.DicPageDeserializer;

@JsonDeserialize(using = DicPageDeserializer.class)
public class DicPage {
    private int pageSize;//一页的数据条目个数
    private int page;//页码
    private int beginPage;//根据页码换算得出的条目起始个数

    private long dicId;
    private String dicName;

    public DicPage(){

    }

    public DicPage(int page,int pageSize){
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

    public long getDicId() {
        return dicId;
    }

    public void setDicId(long dicId) {
        this.dicId = dicId;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }
}

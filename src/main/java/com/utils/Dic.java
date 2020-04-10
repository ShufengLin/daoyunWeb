package com.utils;


import javax.validation.constraints.NotBlank;


public class Dic {
    private long dicId;

    @NotBlank(message = "字典名称不能为空")
    private String dicName;

    private String dicDetail;

    @NotBlank(message = "字典码不能为空")
    private String dicCode;

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

    public String getDicDetail() {
        return dicDetail;
    }

    public void setDicDetail(String dicDetail) {
        this.dicDetail = dicDetail;
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

    public Dic(long dicId, String dicName, String dicDetail, String dicCode) {
        this.dicId = dicId;
        this.dicName = dicName;
        this.dicDetail = dicDetail;
        this.dicCode = dicCode;
    }
}

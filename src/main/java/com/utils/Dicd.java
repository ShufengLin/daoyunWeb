package com.utils;

import javax.validation.constraints.NotBlank;



public class Dicd {
    private long dicId;

    @NotBlank(message = "字典Key不能为空")
    private long dicItemKey;

    @NotBlank(message = "字典Value不能为空")
    private String dicItemValue;

    private long dicStatus;

    @NotBlank(message = "字典码不能为空")
    private String dicCode;

    public long getDicId() {
        return dicId;
    }

    public void setDicId(long dicId) {
        this.dicId = dicId;
    }

    public long getDicItemKey() {
        return dicItemKey;
    }

    public void setDicItemKey(long dicItemKey) {
        this.dicItemKey = dicItemKey;
    }

    public String getDicItemValue() {
        return dicItemValue;
    }

    public void setDicItemValue(String dicItemValue) {
        this.dicItemValue = dicItemValue;
    }

    public long getDicStatus() {
        return dicStatus;
    }

    public void setDicStatus(long dicStatus) {
        this.dicStatus = dicStatus;
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

    public Dicd(long dicId, long dicItemKey, String dicItemValue, long dicStatus, String dicCode) {
        this.dicId = dicId;
        this.dicItemKey = dicItemKey;
        this.dicItemValue = dicItemValue;
        this.dicStatus = dicStatus;
        this.dicCode = dicCode;
    }
}

package com.utils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.utils.json.PaperDetailDeserializer;
import com.utils.json.PaperDetailSerializer;

@JsonSerialize(using = PaperDetailSerializer.class)
@JsonDeserialize(using = PaperDetailDeserializer.class)

public class PaperDetail {
    private long id;
    private long paperId;
    private int itemKey;
    private String itemValue;
    private int isDefault;
    private String code;
    private long parentId;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public long getPaperId() {
        return paperId;
    }

    public void setPaperId(long paperId) {
        this.paperId = paperId;
    }

    public int getItemKey() {
        return itemKey;
    }

    public void setItemKey(int itemKey) {
        this.itemKey = itemKey;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getParentId() { return parentId; }

    public void setParentId(long parentId) { this.parentId = parentId; }

}
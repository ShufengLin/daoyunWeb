package com.utils;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.utils.json.DictionaryDetailDeserializer;
import com.utils.json.DictionaryDetailSerializer;
import com.utils.json.PaperDetailSerializer;

@JsonSerialize(using = DictionaryDetailSerializer.class)
@JsonDeserialize(using = DictionaryDetailDeserializer.class)
public class DictionaryDetail {

  private long id;
  private long dicId;
  private long itemKey;
  private String itemValue;
  private long isDefault;
  private String code;
  private long parentId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDicId() {
    return dicId;
  }

  public void setDicId(long dicId) {
    this.dicId = dicId;
  }


  public long getItemKey() {
    return itemKey;
  }

  public void setItemKey(long itemKey) {
    this.itemKey = itemKey;
  }


  public String getItemValue() {
    return itemValue;
  }

  public void setItemValue(String itemValue) {
    this.itemValue = itemValue;
  }


  public long getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(long isDefault) {
    this.isDefault = isDefault;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }
}

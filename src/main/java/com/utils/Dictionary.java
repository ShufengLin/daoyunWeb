package com.utils;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.utils.json.DictionaryDeserializer;

@JsonDeserialize(using = DictionaryDeserializer.class)
public class Dictionary {

  private long dicId;
  private String dicName;
  private String dicDescription;
  private String code;


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


  public String getDicDescription() {
    return dicDescription;
  }

  public void setDicDescription(String dicDescription) {
    this.dicDescription = dicDescription;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}

package com.utils.json;

import com.dao.DictionaryDetailDao;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.utils.DictionaryDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class DictionaryDetailSerializer extends JsonSerializer<DictionaryDetail> {
    @Autowired
    private DictionaryDetailDao dictionaryDetailDao;

    @Override
    public void serialize(DictionaryDetail dictionaryDetail, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("id", dictionaryDetail.getId());
        jsonGenerator.writeNumberField("dicId",dictionaryDetail.getDicId());
        jsonGenerator.writeNumberField("itemKey",dictionaryDetail.getItemKey());
        jsonGenerator.writeStringField("itemValue",dictionaryDetail.getItemValue());
        jsonGenerator.writeNumberField("isDefault",dictionaryDetail.getIsDefault());
        jsonGenerator.writeStringField("code",dictionaryDetail.getCode());
        jsonGenerator.writeNumberField("parentId",dictionaryDetail.getParentId());
        List<DictionaryDetail> paperDetailChildrenList = dictionaryDetailDao.isChildrenDetailExist(dictionaryDetail.getId());
        if(paperDetailChildrenList.size() != 0){
            jsonGenerator.writeBooleanField("hasChildren",true);
        }
        jsonGenerator.writeEndObject();
    }

}

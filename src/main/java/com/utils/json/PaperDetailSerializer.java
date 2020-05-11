package com.utils.json;

import com.dao.PaperDetailDao;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.utils.PaperDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class PaperDetailSerializer extends JsonSerializer<PaperDetail> {
    @Autowired
    private PaperDetailDao paperDetailDao;

    @Override
    public void serialize(PaperDetail paperDetail, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("id", paperDetail.getId());
        jsonGenerator.writeNumberField("paperId",paperDetail.getPaperId());
        jsonGenerator.writeNumberField("itemKey",paperDetail.getItemKey());
        jsonGenerator.writeStringField("itemValue",paperDetail.getItemValue());
        jsonGenerator.writeNumberField("isDefault",paperDetail.getIsDefault());
        jsonGenerator.writeStringField("code",paperDetail.getCode());
        List<PaperDetail> paperDetailChildrenList = paperDetailDao.isChildrenDetailExist(paperDetail.getId());
        if(paperDetailChildrenList.size() != 0){
            jsonGenerator.writeBooleanField("hasChildren",true);
        }
        jsonGenerator.writeEndObject();
    }
}

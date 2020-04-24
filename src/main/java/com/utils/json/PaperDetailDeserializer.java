package com.utils.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.utils.Paper;
import com.utils.PaperDetail;

import java.io.IOException;

public class PaperDetailDeserializer extends JsonDeserializer<PaperDetail> {
    @Override
    public PaperDetail deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        PaperDetail detail = new PaperDetail();
        if(node.get("id")!=null) {
            detail.setId((Integer) node.get("id").numberValue());
        }
        if(node.get("paperId")!=null) {
            detail.setPaperId((Integer) node.get("paperId").numberValue());
        }
        if(node.get("itemKey")!=null) {
            detail.setItemKey((Integer) node.get("itemKey").numberValue());
        }
        if (node.get("itemValue") != null) {
            detail.setItemValue(node.get("itemValue").asText());
        }
        if(node.get("isDefault")!=null) {
            detail.setIsDefault((Integer) node.get("isDefault").numberValue());
        }
        if (node.get("code") != null) {
            detail.setCode(node.get("code").asText());
        }
        return detail;
    }
}

package com.utils.json;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.utils.DicPage;

import java.io.IOException;

public class DicPageDeserializer extends JsonDeserializer<DicPage> {
    @Override
    public DicPage deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        DicPage dicPage = new DicPage();
        if(node.get("pageSize")!=null){
            dicPage.setPageSize((Integer) node.get("pageSize").numberValue());
        }else{
            dicPage.setPageSize(10);
        }
        if(node.get("page")!=null) {
            dicPage.setPage((Integer) node.get("page").numberValue());
        }
        if(node.get("dicId")!=null) {
            dicPage.setDicId((Integer) node.get("dicId").numberValue());
        }
        if (node.get("dicName") != null) {
            dicPage.setDicName(node.get("dicName").asText());
        }
        return dicPage;
    }
}

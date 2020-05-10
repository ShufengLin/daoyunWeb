package com.utils.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.utils.Dictionary;

import java.io.IOException;

public class DictionaryDeserializer extends JsonDeserializer <Dictionary>{
    @Override
    public Dictionary deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        Dictionary dictionary = new Dictionary();
        if (node.get("dicId") != null) {
            dictionary.setDicId((Integer) node.get("dicId").numberValue());
        }
        if (node.get("dicName") != null) {
            dictionary.setDicName(node.get("dicName").asText());
        }
        if (node.get("code") != null) {
            dictionary.setCode(node.get("code").asText());
        }
        if (node.get("dicDescription") != null) {
            dictionary.setDicDescription(node.get("dicDescription").asText());
        }
        return dictionary;
    }
}

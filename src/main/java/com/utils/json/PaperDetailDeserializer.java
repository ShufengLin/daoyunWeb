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

        return detail;
    }
}

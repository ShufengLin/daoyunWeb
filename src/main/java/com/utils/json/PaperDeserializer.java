
package com.utils.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.utils.Paper;

import java.io.IOException;

public class PaperDeserializer extends JsonDeserializer<Paper> {
    @Override
    public Paper deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        Paper paper = new Paper();
        if (node.get("paperId") != null) {
            paper.setPaperId((Integer) node.get("paperId").numberValue());
        }
        if (node.get("paperName") != null) {
            paper.setPaperName(node.get("paperName").asText());
        }
        if (node.get("paperNum") != null) {
            paper.setPaperNum((Integer) node.get("paperNum").numberValue());
        }
        if (node.get("paperDetail") != null) {
            paper.setPaperDetail(node.get("paperDetail").asText());
        }
        return paper;
    }

}





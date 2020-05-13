package com.utils.json;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.utils.PaperPage;

import java.io.IOException;

public class PaperPageDeserializer extends JsonDeserializer<PaperPage> {
    @Override
    public PaperPage deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        PaperPage paperPage = new PaperPage();
        if(node.get("pageSize")!=null){
            paperPage.setPageSize((Integer) node.get("pageSize").numberValue());
        }else{
            paperPage.setPageSize(10);
        }
        if(node.get("page")!=null) {
            paperPage.setPage((Integer) node.get("page").numberValue());
        }
        if(node.get("paperId")!=null) {
            paperPage.setPaperId((Integer) node.get("paperId").numberValue());
        }
        if (node.get("paperName") != null) {
            paperPage.setPaperName(node.get("paperName").asText());
        }
        if(node.get("courseId")!=null) {
            paperPage.setCourseId((Integer) node.get("courseId").numberValue());
        }
        if (node.get("courseName") != null) {
            paperPage.setCourseName(node.get("courseName").asText());
        }
        if(node.get("userId")!=null) {
            paperPage.setUserId((Integer) node.get("userId").numberValue());
        }
        if (node.get("userName") != null) {
            paperPage.setUserName(node.get("userName").asText());
        }
        if(node.get("roleId")!=null) {
            paperPage.setRoleId((Integer) node.get("roleId").numberValue());
        }
        if (node.get("roleName") != null) {
            paperPage.setRoleName(node.get("roleName").asText());
        }
        return paperPage;
    }

}





package com.prashant.lambdaservicerequestor.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMapping {
  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    String response = "{\r\n" +
      "  \"error\": {\r\n" +
      "    \"code\": 400,\r\n" +
      "    \"message\": \"INVALID_PASSWORD\",\r\n" +
      "    \"errors\": [\r\n" +
      "      {\r\n" +
      "        \"message\": \"INVALID_PASSWORD\",\r\n" +
      "        \"domain\": \"global\",\r\n" +
      "        \"reason\": \"invalid\"\r\n" +
      "      }\r\n" +
      "    ]\r\n" +
      "  }\r\n" +
      "}";

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
    // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    Error errorResponse = objectMapper.readValue(response.getBytes(), Error.class);
    System.out.println(errorResponse.getMessage());
  }
}

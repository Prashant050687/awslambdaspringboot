package com.prashant.lambdaservicerequestor;

import java.util.function.Function;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prashant.lambdaservicerequestor.domain.Error;
import com.prashant.lambdaservicerequestor.domain.LoginRequest;
import com.prashant.lambdaservicerequestor.domain.LoginResponse;
import com.prashant.lambdaservicerequestor.domain.Response;

@Component
public class LoginFunction implements Function<LoginRequest, Response> {

  String apiURL = "https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=<for base api key>";

  @Override
  public Response apply(LoginRequest loginRequest) {

    Response finalResponse = new Response();
    RestTemplate restTemplate = new RestTemplate();

    System.out.println("Login Request Received");

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    ResponseEntity<LoginResponse> response;

    HttpEntity<LoginRequest> request = new HttpEntity<LoginRequest>(loginRequest, headers);
    try {
      response = restTemplate
        .postForEntity(apiURL, request, LoginResponse.class);

      finalResponse.setLoginResponse(response.getBody());

      return finalResponse;
    } catch (HttpStatusCodeException ex) {
      String responseErrorObjectAsString = ex.getResponseBodyAsString();
      ObjectMapper objectMapper = new ObjectMapper();
      objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
      Error errorResponse;
      try {
        errorResponse = objectMapper.readValue(responseErrorObjectAsString.getBytes(), Error.class);
        System.out.println(errorResponse);
        finalResponse.setError(errorResponse);
        System.out.println(responseErrorObjectAsString);
      } catch (Exception e) {
        e.printStackTrace();
      }

      return finalResponse;
    }

  }

}

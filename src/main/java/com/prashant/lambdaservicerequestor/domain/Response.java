package com.prashant.lambdaservicerequestor.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
  private LoginResponse loginResponse;
  @JsonProperty("error")
  private Error error;

  public LoginResponse getLoginResponse() {
    return loginResponse;
  }

  public void setLoginResponse(LoginResponse loginResponse) {
    this.loginResponse = loginResponse;
  }

  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

}

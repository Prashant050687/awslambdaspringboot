package com.prashant.lambdaservicerequestor.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "error")
public class Error {
  @JsonProperty("code")
  private String code;
  @JsonProperty("message")
  private String message;
  @JsonProperty("errors")
  private List<ErrorDetail> errors = new ArrayList<ErrorDetail>();

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public List<ErrorDetail> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDetail> errors) {
    this.errors = errors;
  }

}

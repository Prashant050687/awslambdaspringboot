package com.prashant.lambdaservicerequestor.domain;

public class LoginResponse {
  private String kind;
  private String localId;
  private String email;
  private String displayName;
  private String idToken;
  private String refreshToken;
  private boolean registered;
  private String expieresIn;

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public boolean isRegistered() {
    return registered;
  }

  public void setRegistered(boolean registered) {
    this.registered = registered;
  }

  public String getExpieresIn() {
    return expieresIn;
  }

  public void setExpieresIn(String expieresIn) {
    this.expieresIn = expieresIn;
  }

}

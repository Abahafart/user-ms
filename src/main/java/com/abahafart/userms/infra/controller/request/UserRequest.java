package com.abahafart.userms.infra.controller.request;

public class UserRequest {

  private String userName;
  private String password;
  private String email;
  private PersonRequest person;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PersonRequest getPerson() {
    return person;
  }

  public void setPerson(PersonRequest person) {
    this.person = person;
  }
}

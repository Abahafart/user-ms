package com.abahafart.userms.domain.model;

import java.time.Instant;

public class UserDO {

  private Long id;
  private String userName;
  private String password;
  private String email;
  private Instant createdAt;
  private Instant updatedAt;
  private PersonDO person;
  private StatusDO status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PersonDO getPerson() {
    return person;
  }

  public void setPerson(PersonDO person) {
    this.person = person;
  }

  public StatusDO getStatus() {
    return status;
  }

  public void setStatus(StatusDO status) {
    this.status = status;
  }
}

package com.abahafart.userms.infra.controller.request;

public class StatusRequest {

  private String description;
  private StatusType type;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatusType getType() {
    return type;
  }

  public void setType(StatusType type) {
    this.type = type;
  }
}

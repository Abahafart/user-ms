package com.abahafart.userms.infra.controller.response;

import java.time.Instant;

import com.abahafart.userms.infra.controller.request.StatusType;

public class StatusResponse {

  private Long id;
  private String description;
  private StatusType type;
  private Instant createdAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }
}

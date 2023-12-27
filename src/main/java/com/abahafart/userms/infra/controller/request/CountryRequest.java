package com.abahafart.userms.infra.controller.request;

public class CountryRequest {

  private String name;
  private String description;
  private String shortVersion;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getShortVersion() {
    return shortVersion;
  }

  public void setShortVersion(String shortVersion) {
    this.shortVersion = shortVersion;
  }
}

package com.abahafart.userms.domain.model;

import java.time.Instant;

public class NationalityPersonDO {

  private Instant createdAt;
  private Instant updatedAt;
  private PersonDO person;
  private CountryDO country;

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

  public CountryDO getCountry() {
    return country;
  }

  public void setCountry(CountryDO country) {
    this.country = country;
  }
}

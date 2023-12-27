package com.abahafart.userms.infra.repository.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tbl_nationality")
public class NationalityPersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private Instant createdAt;
  private Instant updatedAt;
  @ManyToOne
  @JoinColumn(name = "person_id")
  private PersonEntity personEntity;
  @ManyToOne
  @JoinColumn(name = "country_id")
  private CountryEntity country;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public PersonEntity getPersonEntity() {
    return personEntity;
  }

  public void setPersonEntity(PersonEntity personEntity) {
    this.personEntity = personEntity;
  }

  public CountryEntity getCountry() {
    return country;
  }

  public void setCountry(CountryEntity country) {
    this.country = country;
  }
}

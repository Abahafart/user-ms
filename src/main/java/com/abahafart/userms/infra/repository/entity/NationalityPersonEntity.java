package com.abahafart.userms.infra.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.Instant;

@Entity(name = "tbl_nationality")
public class NationalityPersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private Instant createdAt;

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

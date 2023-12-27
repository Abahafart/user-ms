package com.abahafart.userms.domain.model;

import java.time.Instant;

public class AddressDO {

  private long id;
  private String street;
  private String number;
  private String neighborhood;
  private String municipality;
  private String state;
  private String zipCode;
  private Instant createdAt;
  private long idPerson;
  private long idCountry;
  private CountryDO country;
  private PersonDO person;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public long getIdPerson() {
    return idPerson;
  }

  public void setIdPerson(long idPerson) {
    this.idPerson = idPerson;
  }

  public long getIdCountry() {
    return idCountry;
  }

  public void setIdCountry(long idCountry) {
    this.idCountry = idCountry;
  }

  public CountryDO getCountry() {
    return country;
  }

  public void setCountry(CountryDO country) {
    this.country = country;
  }

  public PersonDO getPerson() {
    return person;
  }

  public void setPerson(PersonDO person) {
    this.person = person;
  }
}

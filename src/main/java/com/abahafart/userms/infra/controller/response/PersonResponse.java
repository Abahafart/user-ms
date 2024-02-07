package com.abahafart.userms.infra.controller.response;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class PersonResponse {

  private Long id;
  private String name;
  private String surname;
  private String fullName;
  private LocalDate birthDate;
  private Instant createdAt;
  private Instant updatedAt;
  private AddressResponse address;
  private Set<AddressResponse> addressResponses;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
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

  public AddressResponse getAddress() {
    return address;
  }

  public void setAddress(AddressResponse address) {
    this.address = address;
  }

  public Set<AddressResponse> getAddressResponses() {
    return addressResponses;
  }

  public void setAddressResponses(
      Set<AddressResponse> addressResponses) {
    this.addressResponses = addressResponses;
  }
}

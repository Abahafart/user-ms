package com.abahafart.userms.domain.model;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

public class PersonDO {

  private Long id;
  private String name;
  private String surname;
  private String fullName;
  private LocalDate birthDate;
  private Instant createdAt;
  private Instant updatedAt;
  private AddressDO address;
  private Set<AddressDO> addressList;

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

  public AddressDO getAddress() {
    return address;
  }

  public void setAddress(AddressDO address) {
    this.address = address;
  }

  public Set<AddressDO> getAddressList() {
    return addressList;
  }

  public void setAddressList(Set<AddressDO> addressList) {
    this.addressList = addressList;
  }
}

package com.abahafart.userms.infra.repository.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tbl_nationality")
public class NationalityPersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private Instant createdAt;
  private Instant updatedAt;
  private long idPerson;
  private long idCountry;
}

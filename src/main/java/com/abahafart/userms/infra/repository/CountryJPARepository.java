package com.abahafart.userms.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abahafart.userms.infra.repository.entity.CountryEntity;

public interface CountryJPARepository extends JpaRepository<CountryEntity, Long> {

}

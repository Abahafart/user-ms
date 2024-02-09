package com.abahafart.userms.infra.repository;

import com.abahafart.userms.infra.repository.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJPARepository extends JpaRepository<CountryEntity, Long> {}

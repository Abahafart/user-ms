package com.abahafart.userms.infra.repository;

import com.abahafart.userms.infra.repository.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJPARepository extends JpaRepository<PersonEntity, Long> {}

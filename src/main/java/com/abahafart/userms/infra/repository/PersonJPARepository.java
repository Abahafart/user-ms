package com.abahafart.userms.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abahafart.userms.infra.repository.entity.PersonEntity;

public interface PersonJPARepository extends JpaRepository<PersonEntity, Long> {

}

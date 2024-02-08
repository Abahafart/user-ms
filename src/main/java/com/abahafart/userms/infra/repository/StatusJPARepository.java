package com.abahafart.userms.infra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abahafart.userms.infra.repository.entity.StatusEntity;

public interface StatusJPARepository extends JpaRepository<StatusEntity, Long> {

  Optional<StatusEntity> findByDescriptionAndType(String description, String type);
}

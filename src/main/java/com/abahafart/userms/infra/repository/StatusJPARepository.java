package com.abahafart.userms.infra.repository;

import com.abahafart.userms.infra.repository.entity.StatusEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusJPARepository extends JpaRepository<StatusEntity, Long> {

  Optional<StatusEntity> findByDescriptionAndType(String description, String type);
}

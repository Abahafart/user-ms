package com.abahafart.userms.infra.repository;

import com.abahafart.userms.infra.repository.entity.AddressEntity;
import com.abahafart.userms.infra.repository.entity.PersonEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJPARepository extends JpaRepository<AddressEntity, Long> {

  Optional<AddressEntity> findByPerson(PersonEntity personEntity);
}

package com.abahafart.userms.infra.repository.impl;

import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.COUNTRY_NOT_FOUND;
import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND_CODE;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abahafart.userms.domain.exceptions.Error;
import com.abahafart.userms.domain.exceptions.ResourceNotFoundException;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.PersonRepository;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import com.abahafart.userms.infra.repository.PersonJPARepository;
import com.abahafart.userms.infra.repository.entity.PersonEntity;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

  private final PersonJPARepository jpaRepository;
  private final GeneralMapper generalMapper;

  public PersonRepositoryImpl(PersonJPARepository jpaRepository, GeneralMapper generalMapper) {
    this.jpaRepository = jpaRepository;
    this.generalMapper = generalMapper;
  }

  @Override
  public PersonDO create(PersonDO personDO) {
    PersonEntity entity = generalMapper.fromPersonDO(personDO);
    entity.setCreatedAt(Instant.now());
    entity.setUpdatedAt(Instant.now());
    return generalMapper.fromPersonEntity(jpaRepository.save(entity));
  }

  @Override
  public PersonDO getById(long id) {
    return jpaRepository.findById(id).map(generalMapper::fromPersonEntity).orElseThrow(() -> new ResourceNotFoundException(
        List.of(new Error(String.format(COUNTRY_NOT_FOUND, id), RESOURCE_NOT_FOUND_CODE))));
  }
}

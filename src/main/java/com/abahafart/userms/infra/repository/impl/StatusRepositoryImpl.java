package com.abahafart.userms.infra.repository.impl;

import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND_CODE;
import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.STATUS_NOT_FOUND;

import com.abahafart.userms.domain.exceptions.Error;
import com.abahafart.userms.domain.exceptions.ResourceNotFoundException;
import com.abahafart.userms.domain.model.StatusDO;
import com.abahafart.userms.domain.repository.StatusRepository;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import com.abahafart.userms.infra.repository.StatusJPARepository;
import com.abahafart.userms.infra.repository.entity.StatusEntity;

import java.time.Instant;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class StatusRepositoryImpl implements StatusRepository {

  private final StatusJPARepository jpaRepository;
  private final GeneralMapper generalMapper;

  public StatusRepositoryImpl(StatusJPARepository jpaRepository, GeneralMapper generalMapper) {
    this.jpaRepository = jpaRepository;
    this.generalMapper = generalMapper;
  }

  @Override
  public StatusDO getByDescriptionAndType(String description, String type) {
    StatusEntity entity =
        jpaRepository
            .findByDescriptionAndType(description, type)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        List.of(
                            new Error(
                                String.format(STATUS_NOT_FOUND, description, type),
                                RESOURCE_NOT_FOUND_CODE))));
    return generalMapper.fromStatusEntity(entity);
  }

  @Override
  public StatusDO create(StatusDO statusDO) {
    StatusEntity entity = generalMapper.fromStatusDO(statusDO);
    entity.setCreatedAt(Instant.now());
    return generalMapper.fromStatusEntity(jpaRepository.save(entity));
  }

  @Override
  public List<StatusDO> getAll() {
    return jpaRepository.findAll().stream().map(generalMapper::fromStatusEntity).toList();
  }
}

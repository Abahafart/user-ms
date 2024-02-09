package com.abahafart.userms.infra.repository.impl;

import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND;
import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND_CODE;

import com.abahafart.userms.domain.exceptions.Error;
import com.abahafart.userms.domain.exceptions.ResourceNotFoundException;
import com.abahafart.userms.domain.model.UserDO;
import com.abahafart.userms.domain.repository.UserRepository;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import com.abahafart.userms.infra.repository.UserJPARepository;
import com.abahafart.userms.infra.repository.entity.UserEntity;

import java.time.Instant;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

  private final UserJPARepository jpaRepository;
  private final GeneralMapper generalMapper;

  public UserRepositoryImpl(UserJPARepository userJPARepository, GeneralMapper generalMapper) {
    this.jpaRepository = userJPARepository;
    this.generalMapper = generalMapper;
  }

  @Override
  public UserDO create(UserDO userDO) {
    UserEntity entity = generalMapper.fromUserDO(userDO);
    entity.setCreatedAt(Instant.now());
    return generalMapper.fromUserEntity(jpaRepository.save(entity));
  }

  @Override
  public UserDO getById(String id) {
    Long idSearch = Long.parseLong(id);
    UserEntity entity =
        jpaRepository
            .findById(idSearch)
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        List.of(
                            new Error(
                                String.format(RESOURCE_NOT_FOUND, id), RESOURCE_NOT_FOUND_CODE))));
    return generalMapper.fromUserEntity(entity);
  }
}

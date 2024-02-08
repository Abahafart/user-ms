package com.abahafart.userms.infra.repository.impl;

import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND;
import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND_CODE;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abahafart.userms.domain.exceptions.Error;
import com.abahafart.userms.domain.exceptions.ResourceNotFoundException;
import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.repository.CountryRepository;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import com.abahafart.userms.infra.repository.CountryJPARepository;
import com.abahafart.userms.infra.repository.entity.CountryEntity;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

  private final GeneralMapper generalMapper;
  private final CountryJPARepository countryJPARepository;

  public CountryRepositoryImpl(GeneralMapper generalMapper,
      CountryJPARepository countryJPARepository) {
    this.generalMapper = generalMapper;
    this.countryJPARepository = countryJPARepository;
  }

  @Override
  public CountryDO create(CountryDO country) {
    CountryEntity entity = generalMapper.toEntityFromCountryDO(country);
    entity.setCreatedAt(Instant.now());
    entity.setUpdatedAt(Instant.now());
    return generalMapper.fromCountryEntity(countryJPARepository.save(entity));
  }

  @Override
  public CountryDO getById(Long id) {
    return generalMapper.fromCountryEntity(
        countryJPARepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
            List.of(new Error(String.format(RESOURCE_NOT_FOUND, id), RESOURCE_NOT_FOUND_CODE)))));
  }
}

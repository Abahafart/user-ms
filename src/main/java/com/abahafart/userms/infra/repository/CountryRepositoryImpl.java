package com.abahafart.userms.infra.repository;

import java.time.Instant;

import org.springframework.stereotype.Repository;

import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.repository.CountryRepository;
import com.abahafart.userms.infra.mapper.GeneralMapper;
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
    return generalMapper.fromCountryEntity(countryJPARepository.findById(id).get());
  }
}

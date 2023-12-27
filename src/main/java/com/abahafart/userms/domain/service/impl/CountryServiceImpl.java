package com.abahafart.userms.domain.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.repository.CountryRepository;
import com.abahafart.userms.domain.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

  private final CountryRepository countryRepository;

  public CountryServiceImpl(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  @Override
  public CountryDO create(CountryDO countryDO) {
    return countryRepository.create(countryDO);
  }

  @Override
  public List<CountryDO> findAll(Map<String, Object> filters) {
    return null;
  }

  @Override
  public CountryDO getById(Long id) {
    return null;
  }
}

package com.abahafart.userms.domain.service;

import java.util.List;
import java.util.Map;

import com.abahafart.userms.domain.model.CountryDO;

public interface CountryService {

  CountryDO create(CountryDO countryDO);
  List<CountryDO> findAll(Map<String, Object> filters);
  CountryDO getById(Long id);
}

package com.abahafart.userms.domain.service;

import com.abahafart.userms.domain.model.CountryDO;

public interface CountryService {

  CountryDO create(CountryDO countryDO);
  CountryDO getById(Long id);
}

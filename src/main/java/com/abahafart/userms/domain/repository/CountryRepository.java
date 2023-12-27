package com.abahafart.userms.domain.repository;

import com.abahafart.userms.domain.model.CountryDO;

public interface CountryRepository {
  CountryDO create(CountryDO country);
  CountryDO getById(Long id);
}

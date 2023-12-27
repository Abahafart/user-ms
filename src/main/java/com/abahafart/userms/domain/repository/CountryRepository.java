package com.abahafart.userms.domain.repository;

import java.util.List;
import java.util.Map;

import com.abahafart.userms.domain.model.CountryDO;

public interface CountryRepository {
  CountryDO create(CountryDO country);
  List<CountryDO> findAllRecords(Map<String, Object> filters);
  CountryDO getById(Long id);
}

package com.abahafart.userms.domain.repository;

import java.util.List;
import java.util.Map;

import com.abahafart.userms.domain.model.PersonDO;

public interface PersonRepository {

  PersonDO create(PersonDO personDO);
  List<PersonDO> findAllRecords(Map<String, Object> filters);
  PersonDO getById(long id);
}

package com.abahafart.userms.domain.service;

import java.util.List;
import java.util.Map;

import com.abahafart.userms.domain.model.PersonDO;

public interface PersonService {

  PersonDO create(PersonDO personDO);
  List<PersonDO> findAll(Map<String, Object> filters);
}

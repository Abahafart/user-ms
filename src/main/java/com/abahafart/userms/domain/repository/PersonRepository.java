package com.abahafart.userms.domain.repository;

import com.abahafart.userms.domain.model.PersonDO;

public interface PersonRepository {

  PersonDO create(PersonDO personDO);
  PersonDO getById(long id);
}

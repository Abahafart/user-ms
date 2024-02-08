package com.abahafart.userms.domain.service;

import com.abahafart.userms.domain.model.PersonDO;

public interface PersonService {

  PersonDO create(PersonDO personDO);

  PersonDO getById(Long id);
}

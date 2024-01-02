package com.abahafart.userms.domain.service.impl;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.PersonRepository;
import com.abahafart.userms.domain.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  public PersonServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public PersonDO create(PersonDO personDO) {
    return personRepository.create(personDO);
  }

  @Override
  public PersonDO getById(Long id) {
    return personRepository.getById(id);
  }
}

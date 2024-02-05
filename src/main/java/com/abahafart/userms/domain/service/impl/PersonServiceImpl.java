package com.abahafart.userms.domain.service.impl;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.PersonRepository;
import com.abahafart.userms.domain.service.AddressService;
import com.abahafart.userms.domain.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;
  private final AddressService addressService;

  public PersonServiceImpl(PersonRepository personRepository, AddressService addressService) {
    this.personRepository = personRepository;
    this.addressService = addressService;
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

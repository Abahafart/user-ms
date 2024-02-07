package com.abahafart.userms.domain.service.impl;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.AddressRepository;
import com.abahafart.userms.domain.service.AddressService;
import com.abahafart.userms.domain.service.CountryService;
import com.abahafart.userms.domain.service.PersonService;

@Service
public class AddressServiceImpl implements AddressService {

  private final AddressRepository repository;

  public AddressServiceImpl(AddressRepository repository) {
    this.repository = repository;
  }

  @Override
  public AddressDO create(AddressDO addressDO) {
    addressDO.setCountry(addressDO.getCountry());
    addressDO.setPerson(addressDO.getPerson());
    return repository.create(addressDO);
  }

  @Override
  public AddressDO getById(long id) {
    return repository.getById(id);
  }

  @Override
  public AddressDO getByPerson(PersonDO personDO) {
    return repository.getByIdPerson(personDO);
  }
}

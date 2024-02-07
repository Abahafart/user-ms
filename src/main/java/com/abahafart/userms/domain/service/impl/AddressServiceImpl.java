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
  private final PersonService personService;
  private final CountryService countryService;

  public AddressServiceImpl(AddressRepository repository, PersonService personService,
      CountryService countryService) {
    this.repository = repository;
    this.personService = personService;
    this.countryService = countryService;
  }

  @Override
  public AddressDO create(AddressDO addressDO) {
    PersonDO personDO = personService.getById(addressDO.getIdPerson());
    CountryDO countryDO = countryService.getById(addressDO.getIdCountry());
    addressDO.setCountry(countryDO);
    addressDO.setPerson(personDO);
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

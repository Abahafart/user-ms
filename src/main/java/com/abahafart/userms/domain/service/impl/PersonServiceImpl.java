package com.abahafart.userms.domain.service.impl;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.PersonRepository;
import com.abahafart.userms.domain.service.AddressService;
import com.abahafart.userms.domain.service.CountryService;
import com.abahafart.userms.domain.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;
  private final AddressService addressService;
  private final CountryService countryService;

  public PersonServiceImpl(
      PersonRepository personRepository,
      AddressService addressService,
      CountryService countryService) {
    this.personRepository = personRepository;
    this.addressService = addressService;
    this.countryService = countryService;
  }

  @Override
  public PersonDO create(PersonDO personDO) {
    CountryDO countryDO = countryService.getById(personDO.getAddress().getCountry().getId());
    PersonDO saved = personRepository.create(personDO);
    AddressDO addressDO = personDO.getAddress();
    addressDO.setCountry(countryDO);
    addressDO.setPerson(saved);
    AddressDO addressDO1 = addressService.create(addressDO);
    saved.setAddress(addressDO1);
    return saved;
  }

  @Override
  public PersonDO getById(Long id) {
    PersonDO personDO = personRepository.getById(id);
    return personDO;
  }
}

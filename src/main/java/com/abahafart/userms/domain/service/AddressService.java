package com.abahafart.userms.domain.service;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.PersonDO;

public interface AddressService {

  AddressDO create(AddressDO addressDO);
  AddressDO getById(long id);
  AddressDO getByPerson(PersonDO personDO);
}

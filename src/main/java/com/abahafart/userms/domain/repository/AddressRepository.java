package com.abahafart.userms.domain.repository;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.PersonDO;

public interface AddressRepository {

  AddressDO create(AddressDO address);
  AddressDO getById(long id);
  AddressDO getByIdPerson(PersonDO idPerson);
}

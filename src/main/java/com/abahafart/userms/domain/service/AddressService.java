package com.abahafart.userms.domain.service;

import com.abahafart.userms.domain.model.AddressDO;

public interface AddressService {

  AddressDO create(AddressDO addressDO);
  AddressDO getById(long id);
  AddressDO getByPersonId(long personId);
}

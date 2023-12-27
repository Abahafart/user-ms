package com.abahafart.userms.domain.repository;

import com.abahafart.userms.domain.model.AddressDO;

public interface AddressRepository {

  AddressDO create(AddressDO address);
  AddressDO getById(long id);
}

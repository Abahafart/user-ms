package com.abahafart.userms.domain.repository;

import java.util.List;
import java.util.Map;

import com.abahafart.userms.domain.model.AddressDO;

public interface AddressRepository {

  AddressDO create(AddressDO address);
  List<AddressDO> findAllRecords(Map<String, Object> filters);
  AddressDO getById(long id);
}

package com.abahafart.userms.domain.service;

import java.util.List;
import java.util.Map;

import com.abahafart.userms.domain.model.AddressDO;

public interface AddressService {

  AddressDO create(AddressDO addressDO);
  List<AddressDO> findAll(Map<String, Object> filters);
}

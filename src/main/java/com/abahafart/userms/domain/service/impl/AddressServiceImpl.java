package com.abahafart.userms.domain.service.impl;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.repository.AddressRepository;
import com.abahafart.userms.domain.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

  private final AddressRepository repository;

  public AddressServiceImpl(AddressRepository repository) {
    this.repository = repository;
  }

  @Override
  public AddressDO create(AddressDO addressDO) {
    return repository.create(addressDO);
  }

  @Override
  public AddressDO getById(long id) {
    return repository.getById(id);
  }

  @Override
  public AddressDO getByPersonId(long personId) {
    return null;
  }
}

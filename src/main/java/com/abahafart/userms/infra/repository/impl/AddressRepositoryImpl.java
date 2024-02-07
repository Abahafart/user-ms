package com.abahafart.userms.infra.repository.impl;

import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.COUNTRY_NOT_FOUND;
import static com.abahafart.userms.infra.repository.constants.RepositoryConstants.RESOURCE_NOT_FOUND_CODE;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.abahafart.userms.domain.exceptions.Error;
import com.abahafart.userms.domain.exceptions.ResourceNotFoundException;
import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.AddressRepository;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import com.abahafart.userms.infra.repository.AddressJPARepository;
import com.abahafart.userms.infra.repository.entity.AddressEntity;

@Repository
public class AddressRepositoryImpl implements AddressRepository {

  private final GeneralMapper generalMapper;
  private final AddressJPARepository addressJPARepository;

  public AddressRepositoryImpl(GeneralMapper generalMapper,
      AddressJPARepository addressJPARepository) {
    this.generalMapper = generalMapper;
    this.addressJPARepository = addressJPARepository;
  }

  @Override
  public AddressDO create(AddressDO address) {
    AddressEntity entity = generalMapper.fromAddressModel(address);
    AddressDO saved = generalMapper.fromAddressEntity(addressJPARepository.save(entity));
    return saved;
  }

  @Override
  public AddressDO getById(long id) {
    return generalMapper.fromAddressEntity(
        addressJPARepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
            List.of(new Error(String.format(COUNTRY_NOT_FOUND, id), RESOURCE_NOT_FOUND_CODE)))));
  }

  @Override
  public AddressDO getByIdPerson(PersonDO idPerson) {
    return generalMapper.fromAddressEntity(addressJPARepository.findByPerson(
        generalMapper.fromPersonDO(idPerson)).orElse(new AddressEntity()));
  }
}

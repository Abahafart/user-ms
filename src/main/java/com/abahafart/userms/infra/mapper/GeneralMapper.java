package com.abahafart.userms.infra.mapper;

import org.mapstruct.Mapper;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.infra.controller.request.AddressRequest;
import com.abahafart.userms.infra.controller.request.CountryRequest;
import com.abahafart.userms.infra.controller.request.PersonRequest;
import com.abahafart.userms.infra.controller.response.AddressResponse;
import com.abahafart.userms.infra.controller.response.CountryResponse;
import com.abahafart.userms.infra.controller.response.PersonResponse;
import com.abahafart.userms.infra.repository.entity.AddressEntity;
import com.abahafart.userms.infra.repository.entity.CountryEntity;
import com.abahafart.userms.infra.repository.entity.PersonEntity;

@Mapper
public interface GeneralMapper {

  CountryDO fromCountryRequest(CountryRequest request);
  CountryResponse fromCountryDO(CountryDO countryDO);
  CountryDO fromCountryEntity(CountryEntity entity);
  CountryEntity toEntityFromCountryDO(CountryDO countryDO);
  PersonEntity fromPersonDO(PersonDO personDO);
  PersonDO fromPersonEntity(PersonEntity entity);
  PersonDO fromPersonRequest(PersonRequest request);
  PersonResponse fromPersonDOToResponse(PersonDO personDO);
  AddressEntity fromAddressModel(AddressDO addressDO);
  AddressDO fromAddressEntity(AddressEntity entity);
  AddressDO fromAddressRequest(AddressRequest request);
  AddressResponse fromAddressDOToResponse(AddressDO addressDO);
}

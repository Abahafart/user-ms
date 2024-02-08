package com.abahafart.userms.infra.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.model.StatusDO;
import com.abahafart.userms.domain.model.UserDO;
import com.abahafart.userms.infra.controller.request.AddressRequest;
import com.abahafart.userms.infra.controller.request.CountryRequest;
import com.abahafart.userms.infra.controller.request.PersonRequest;
import com.abahafart.userms.infra.controller.request.UserRequest;
import com.abahafart.userms.infra.controller.response.AddressResponse;
import com.abahafart.userms.infra.controller.response.CountryResponse;
import com.abahafart.userms.infra.controller.response.PersonResponse;
import com.abahafart.userms.infra.controller.response.UserResponse;
import com.abahafart.userms.infra.repository.entity.AddressEntity;
import com.abahafart.userms.infra.repository.entity.CountryEntity;
import com.abahafart.userms.infra.repository.entity.PersonEntity;
import com.abahafart.userms.infra.repository.entity.StatusEntity;
import com.abahafart.userms.infra.repository.entity.UserEntity;

@Mapper
public interface GeneralMapper {

  CountryDO fromCountryRequest(CountryRequest request);

  CountryResponse fromCountryDO(CountryDO countryDO);

  CountryDO fromCountryEntity(CountryEntity entity);

  CountryEntity toEntityFromCountryDO(CountryDO countryDO);

  PersonEntity fromPersonDO(PersonDO personDO);

  @Mapping(source = "addressEntities", target = "addressList")
  PersonDO fromPersonEntity(PersonEntity entity);

  PersonDO fromPersonRequest(PersonRequest request);

  @Mapping(source = "addressList", target = "addressResponses")
  PersonResponse fromPersonDOToResponse(PersonDO personDO);

  AddressEntity fromAddressModel(AddressDO addressDO);

  AddressDO fromAddressEntity(AddressEntity entity);

  AddressDO fromAddressRequest(AddressRequest request);

  AddressResponse fromAddressDOToResponse(AddressDO addressDO);

  UserDO fromUserRequest(UserRequest request);

  UserEntity fromUserDO(UserDO userDO);

  UserResponse fromUserDOToResponse(UserDO userDO);

  UserDO fromUserEntity(UserEntity entity);
  StatusDO fromStatusEntity(StatusEntity entity);

}
package com.abahafart.userms.infra.mapper;

import org.mapstruct.Mapper;

import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.infra.controller.request.CountryRequest;
import com.abahafart.userms.infra.controller.response.CountryResponse;
import com.abahafart.userms.infra.repository.entity.CountryEntity;

@Mapper
public interface GeneralMapper {

  CountryDO fromCountryRequest(CountryRequest request);
  CountryResponse fromCountryDO(CountryDO countryDO);
  CountryDO fromCountryEntity(CountryEntity entity);
  CountryEntity toEntityFromCountryDO(CountryDO countryDO);
}

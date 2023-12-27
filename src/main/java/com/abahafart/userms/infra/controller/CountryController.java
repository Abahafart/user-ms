package com.abahafart.userms.infra.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.service.CountryService;
import com.abahafart.userms.infra.controller.request.CountryRequest;
import com.abahafart.userms.infra.controller.response.CountryResponse;
import com.abahafart.userms.infra.mapper.GeneralMapper;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {
  private final CountryService countryService;
  private final GeneralMapper generalMapper;

  public CountryController(CountryService countryService, GeneralMapper generalMapper) {
    this.countryService = countryService;
    this.generalMapper = generalMapper;
  }

  @PostMapping
  public CountryResponse createCountry(@RequestBody CountryRequest request) {
    CountryDO countryDO = generalMapper.fromCountryRequest(request);
    return generalMapper.fromCountryDO(countryService.create(countryDO));
  }

  @GetMapping
  public List<CountryResponse> findAllRecords(@RequestParam Map<String, Object> filters) {
    List<CountryDO> countryList = countryService.findAll(filters);
    return countryList.stream().map(generalMapper::fromCountryDO).toList();
  }
}

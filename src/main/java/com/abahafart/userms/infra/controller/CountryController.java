package com.abahafart.userms.infra.controller;

import com.abahafart.userms.domain.model.CountryDO;
import com.abahafart.userms.domain.service.CountryService;
import com.abahafart.userms.infra.controller.request.CountryRequest;
import com.abahafart.userms.infra.controller.response.CountryResponse;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {
  public static final Logger log = LoggerFactory.getLogger(CountryController.class);
  private final CountryService countryService;
  private final GeneralMapper generalMapper;

  public CountryController(CountryService countryService, GeneralMapper generalMapper) {
    this.countryService = countryService;
    this.generalMapper = generalMapper;
  }

  @PostMapping
  public CountryResponse createCountry(@RequestBody CountryRequest request) {
    long started = System.currentTimeMillis();
    log.info("Request received {}", request);
    CountryDO countryDO = generalMapper.fromCountryRequest(request);
    log.info("Finished process {}",System.currentTimeMillis()-started);
    return generalMapper.fromCountryDO(countryService.create(countryDO));
  }

  @GetMapping("{id}")
  public CountryResponse getById(@PathVariable Long id) {
    log.info("Country to find with id {}", id);
    return generalMapper.fromCountryDO(countryService.getById(id));
  }
}

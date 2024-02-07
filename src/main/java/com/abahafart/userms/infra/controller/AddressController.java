package com.abahafart.userms.infra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.service.AddressService;
import com.abahafart.userms.infra.controller.request.AddressRequest;
import com.abahafart.userms.infra.controller.response.AddressResponse;
import com.abahafart.userms.infra.mapper.GeneralMapper;

@RestController
@RequestMapping("/addresses")
public class AddressController {

  private static final Logger log = LoggerFactory.getLogger(AddressController.class);
  private final AddressService addressService;
  private final GeneralMapper generalMapper;

  public AddressController(AddressService addressService, GeneralMapper generalMapper) {
    this.addressService = addressService;
    this.generalMapper = generalMapper;
  }

  @PostMapping
  public AddressResponse create(@RequestBody AddressRequest request) {
    log.info("Information received {}", request);
    AddressDO addressDO = generalMapper.fromAddressRequest(request);
    AddressDO responseDO = addressService.create(addressDO);
    log.info("Response created {}", responseDO);
    return generalMapper.fromAddressDOToResponse(responseDO);
  }

  @GetMapping("{id}")
  public AddressResponse getBYId(@PathVariable Long id) {
    log.info("Id to found {}", id);
    AddressDO addressDO = addressService.getById(id);
    log.info("Information found {}", addressDO);
    return generalMapper.fromAddressDOToResponse(addressDO);
  }
}

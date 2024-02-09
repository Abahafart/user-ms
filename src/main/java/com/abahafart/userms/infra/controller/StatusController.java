package com.abahafart.userms.infra.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abahafart.userms.domain.model.StatusDO;
import com.abahafart.userms.domain.service.StatusService;
import com.abahafart.userms.infra.controller.request.StatusRequest;
import com.abahafart.userms.infra.controller.response.StatusResponse;
import com.abahafart.userms.infra.mapper.GeneralMapper;

@RestController
@RequestMapping("status")
public class StatusController {

  private final StatusService statusService;
  private final GeneralMapper generalMapper;

  public StatusController(StatusService statusService, GeneralMapper generalMapper) {
    this.statusService = statusService;
    this.generalMapper = generalMapper;
  }

  @PostMapping
  public StatusResponse create(@RequestBody StatusRequest request) {
    StatusDO statusDO = generalMapper.fromStatusRequest(request);
    StatusDO responseDO = statusService.create(statusDO);
    return generalMapper.fromStatusResponse(responseDO);
  }

  @GetMapping
  public List<StatusResponse> getAll() {
    List<StatusDO> found = statusService.getAll();
    return found.stream().map(generalMapper::fromStatusResponse).toList();
  }
}

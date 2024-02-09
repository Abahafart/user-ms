package com.abahafart.userms.infra.controller;

import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.service.PersonService;
import com.abahafart.userms.infra.controller.request.PersonRequest;
import com.abahafart.userms.infra.controller.response.PersonResponse;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

  private final GeneralMapper generalMapper;
  private final PersonService personService;

  public PersonController(GeneralMapper generalMapper, PersonService personService) {
    this.generalMapper = generalMapper;
    this.personService = personService;
  }

  @PostMapping
  public PersonResponse create(@RequestBody PersonRequest request) {
    PersonDO personDO = generalMapper.fromPersonRequest(request);
    return generalMapper.fromPersonDOToResponse(personService.create(personDO));
  }

  @GetMapping("/{id}")
  public PersonResponse getById(@PathVariable Long id) {
    return generalMapper.fromPersonDOToResponse(personService.getById(id));
  }
}

package com.abahafart.userms.domain.service.impl;

import static com.abahafart.userms.domain.service.constant.ServiceConstants.ACTIVE;
import static com.abahafart.userms.domain.service.constant.ServiceConstants.USER;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.model.StatusDO;
import com.abahafart.userms.domain.model.UserDO;
import com.abahafart.userms.domain.repository.PersonRepository;
import com.abahafart.userms.domain.repository.UserRepository;
import com.abahafart.userms.domain.service.StatusService;
import com.abahafart.userms.domain.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final PersonRepository personRepository;
  private final StatusService statusService;

  public UserServiceImpl(
      UserRepository userRepository,
      PersonRepository personRepository,
      StatusService statusService) {
    this.userRepository = userRepository;
    this.personRepository = personRepository;
    this.statusService = statusService;
  }

  @Override
  public UserDO create(UserDO userDO) {
    PersonDO personDO = personRepository.getById(userDO.getPerson().getId());
    StatusDO statusDO = statusService.getByDescriptionAndType(ACTIVE, USER);
    userDO.setStatus(statusDO);
    userDO.setPerson(personDO);
    return userRepository.create(userDO);
  }

  @Override
  public UserDO getById(String id) {
    return null;
  }
}

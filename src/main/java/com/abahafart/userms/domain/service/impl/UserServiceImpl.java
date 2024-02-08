package com.abahafart.userms.domain.service.impl;

import static com.abahafart.userms.domain.service.constant.ServiceConstants.ACTIVE;
import static com.abahafart.userms.domain.service.constant.ServiceConstants.USER;

import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.model.StatusDO;
import com.abahafart.userms.domain.model.UserDO;
import com.abahafart.userms.domain.repository.PersonRepository;
import com.abahafart.userms.domain.repository.StatusRepository;
import com.abahafart.userms.domain.repository.UserRepository;
import com.abahafart.userms.domain.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final PersonRepository personRepository;
  private final StatusRepository statusRepository;

  public UserServiceImpl(
      UserRepository userRepository,
      PersonRepository personRepository,
      StatusRepository statusRepository) {
    this.userRepository = userRepository;
    this.personRepository = personRepository;
    this.statusRepository = statusRepository;
  }

  @Override
  public UserDO create(UserDO userDO) {
    PersonDO personDO = personRepository.getById(userDO.getPerson().getId());
    StatusDO statusDO = statusRepository.getByDescriptionAndType(ACTIVE, USER);
    userDO.setStatus(statusDO);
    userDO.setPerson(personDO);
    return userRepository.create(userDO);
  }

  @Override
  public UserDO getById(String id) {
    return null;
  }
}

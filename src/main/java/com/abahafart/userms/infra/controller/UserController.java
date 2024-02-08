package com.abahafart.userms.infra.controller;

import com.abahafart.userms.domain.model.UserDO;
import com.abahafart.userms.domain.service.UserService;
import com.abahafart.userms.infra.controller.request.UserRequest;
import com.abahafart.userms.infra.controller.response.UserResponse;
import com.abahafart.userms.infra.mapper.GeneralMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private static final Logger log = LoggerFactory.getLogger(UserController.class);
  private final GeneralMapper generalMapper;
  private final UserService userService;

  public UserController(GeneralMapper generalMapper, UserService userService) {
    this.generalMapper = generalMapper;
    this.userService = userService;
  }

  @PostMapping
  public UserResponse create(@RequestBody UserRequest request) {
    log.info("Request received {}", request);
    UserDO userDO = generalMapper.fromUserRequest(request);
    UserDO responseDO = userService.create(userDO);
    log.info("Response generated {}", responseDO);
    return generalMapper.fromUserDOToResponse(responseDO);
  }
}

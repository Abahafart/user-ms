package com.abahafart.userms.domain.service;

import com.abahafart.userms.domain.model.UserDO;

public interface UserService {

  UserDO create(UserDO userDO);
  UserDO getById(String id);

}

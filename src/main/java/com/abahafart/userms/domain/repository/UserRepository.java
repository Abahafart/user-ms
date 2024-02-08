package com.abahafart.userms.domain.repository;

import com.abahafart.userms.domain.model.UserDO;

public interface UserRepository {

  UserDO create(UserDO userDO);

  UserDO getById(String id);
}

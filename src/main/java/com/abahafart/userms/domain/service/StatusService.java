package com.abahafart.userms.domain.service;

import java.util.List;

import com.abahafart.userms.domain.model.StatusDO;

public interface StatusService {

  StatusDO create(StatusDO statusDO);
  List<StatusDO> getAll();

  StatusDO getByDescriptionAndType(String description, String type);

}

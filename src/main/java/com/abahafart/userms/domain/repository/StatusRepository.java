package com.abahafart.userms.domain.repository;

import java.util.List;

import com.abahafart.userms.domain.model.StatusDO;

public interface StatusRepository {

  StatusDO getByDescriptionAndType(String description, String type);
  StatusDO create(StatusDO statusDO);
  List<StatusDO> getAll();
}

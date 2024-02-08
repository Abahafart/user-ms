package com.abahafart.userms.domain.repository;

import com.abahafart.userms.domain.model.StatusDO;

public interface StatusRepository {

  StatusDO getByDescriptionAndType(String description, String type);

}

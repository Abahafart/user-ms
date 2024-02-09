package com.abahafart.userms.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abahafart.userms.domain.model.StatusDO;
import com.abahafart.userms.domain.repository.StatusRepository;
import com.abahafart.userms.domain.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

  private final StatusRepository statusRepository;

  public StatusServiceImpl(StatusRepository statusRepository) {
    this.statusRepository = statusRepository;
  }

  @Override
  public StatusDO create(StatusDO statusDO) {
    return statusRepository.create(statusDO);
  }

  @Override
  public List<StatusDO> getAll() {
    return statusRepository.getAll();
  }

  @Override
  public StatusDO getByDescriptionAndType(String description, String type) {
    return statusRepository.getByDescriptionAndType(description, type);
  }
}

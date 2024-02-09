package com.abahafart.userms.infra.repository;

import com.abahafart.userms.infra.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<UserEntity, Long> {}

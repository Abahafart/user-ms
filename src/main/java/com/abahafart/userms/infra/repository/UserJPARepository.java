package com.abahafart.userms.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abahafart.userms.infra.repository.entity.UserEntity;

public interface UserJPARepository extends JpaRepository<UserEntity, Long> {

}

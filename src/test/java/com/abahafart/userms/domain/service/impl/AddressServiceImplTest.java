package com.abahafart.userms.domain.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.abahafart.userms.EasyRandomCore;
import com.abahafart.userms.domain.model.AddressDO;
import com.abahafart.userms.domain.model.PersonDO;
import com.abahafart.userms.domain.repository.AddressRepository;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddressServiceImplTest {

  private AddressRepository repository;
  private EasyRandom easyRandom;
  private AddressServiceImpl addressService;

  @BeforeEach
  void setUp() {
    repository = mock(AddressRepository.class);
    easyRandom = EasyRandomCore.easyRandomStatic();
    addressService = new AddressServiceImpl(repository);
  }

  @Test
  void create() {
    // Given
    AddressDO addressDO = easyRandom.nextObject(AddressDO.class);
    when(repository.create(any())).thenReturn(addressDO);

    // When
    AddressDO response = addressService.create(addressDO);

    // Then
    assertThat(response).isNotNull().usingRecursiveComparison().isEqualTo(addressDO);
  }

  @Test
  void getById() {
    // Given
    AddressDO addressDO = easyRandom.nextObject(AddressDO.class);
    when(repository.getById(anyLong())).thenReturn(addressDO);

    // When
    AddressDO response = addressService.getById(easyRandom.nextLong());

    // Then
    assertThat(response).isNotNull().usingRecursiveComparison().isEqualTo(addressDO);
  }

  @Test
  void getByPerson() {
    /// Given
    AddressDO addressDO = easyRandom.nextObject(AddressDO.class);
    when(repository.getByIdPerson(any())).thenReturn(addressDO);

    // When
    AddressDO response = addressService.getByPerson(easyRandom.nextObject(PersonDO.class));

    // Then
    assertThat(response).isNotNull().usingRecursiveComparison().isEqualTo(addressDO);
  }
}

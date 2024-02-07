package com.abahafart.userms.domain.exceptions;

import java.util.List;

public class ResourceNotFoundException extends RuntimeException {

  private final List<Error> errors;

  public ResourceNotFoundException(Throwable cause, List<Error> errors) {
    super(cause);
    this.errors = errors;
  }

  public ResourceNotFoundException(List<Error> errors) {
    this.errors = errors;
  }

  public List<Error> getErrors() {
    return errors;
  }
}

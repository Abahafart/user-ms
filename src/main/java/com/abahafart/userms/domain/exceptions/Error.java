package com.abahafart.userms.domain.exceptions;

public class Error {

  private String message;
  private int code;

  public Error() {
  }

  public Error(String message, int code) {
    this.message = message;
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public int getCode() {
    return code;
  }
}

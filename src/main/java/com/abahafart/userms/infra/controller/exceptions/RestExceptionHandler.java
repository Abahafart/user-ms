package com.abahafart.userms.infra.controller.exceptions;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.abahafart.userms.domain.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestExceptionHandler {

  private static final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);
  private static final String ERRORS = "errors";

  ProblemDetail defaultErrorResponseBuilder(
      HttpServletRequest request, HttpStatus status, String message) throws URISyntaxException {
    ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(status, message);
    problemDetail.setInstance(new URI(request.getServletPath()));
    problemDetail.setTitle(status.getReasonPhrase());
    return problemDetail;
  }

  @ExceptionHandler(ResourceNotFoundException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ProblemDetail businessValidationError(
      ResourceNotFoundException exception, HttpServletRequest request)
      throws URISyntaxException {
    ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
    problemDetail.setTitle(HttpStatus.BAD_REQUEST.getReasonPhrase());
    problemDetail.setInstance(new URI(request.getServletPath()));
    problemDetail.setProperty(ERRORS, exception.getErrors());
    return problemDetail;
  }
}

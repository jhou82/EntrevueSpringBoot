package com.example.entrevueSpringBoot.film.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
class FilmExceptionHandler {

	@Autowired
	MessageSource messageSource;
	
	  @ResponseBody
	  @ExceptionHandler(FilmNotFoundException.class)
	  ResponseEntity<ErrorResponse> filmNotFoundException(FilmNotFoundException ex) {
	    
		  ErrorResponse errorResponse = new ErrorResponse();
		  errorResponse.setMessage(messageSource.getMessage("error.resource.film.notfound", new Object[]{ex.getFilmId()}, null));
		  return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
	  }
	
}

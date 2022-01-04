package com.dio.personapi.exception;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(Long id) {

        super("Person not found with ID " + id);
    }

    
}

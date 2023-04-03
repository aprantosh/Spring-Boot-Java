package com.training.ambulanceservice.exception;

import lombok.Getter;

@Getter
public class AmbulanceNotFoundException extends RuntimeException {

    public String message;

    public AmbulanceNotFoundException(String message){
        super(message);
        this.message = message;
    }
}
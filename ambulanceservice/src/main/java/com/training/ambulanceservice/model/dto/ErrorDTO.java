package com.training.ambulanceservice.model.dto;

import lombok.Data;

@Data
public class ErrorDTO {

    private int errorCode;
    private String errorMessage;

}
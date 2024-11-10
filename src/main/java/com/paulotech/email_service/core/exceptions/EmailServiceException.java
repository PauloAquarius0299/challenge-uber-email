package com.paulotech.email_service.core.exceptions;

public class EmailServiceException extends RuntimeException{

    public EmailServiceException(String message){
        super(message);
    }

    public EmailServiceException(String message, Throwable couse){
        super(message, couse);
    }
}

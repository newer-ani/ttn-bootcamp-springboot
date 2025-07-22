package com.ttn.Spring_Boot.Assingments.exceptionhandling;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

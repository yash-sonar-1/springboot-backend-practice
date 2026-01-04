package com.yash.backend.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);// used super to called parent class constructor and pass message to it
    }
}

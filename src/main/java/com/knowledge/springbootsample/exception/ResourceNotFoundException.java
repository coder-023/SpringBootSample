package com.knowledge.springbootsample.exception;

import org.springframework.stereotype.Component;


public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}

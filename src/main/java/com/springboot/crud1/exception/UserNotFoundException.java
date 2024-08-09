package com.springboot.crud1.exception;


public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}

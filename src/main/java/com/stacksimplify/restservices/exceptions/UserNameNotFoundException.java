package com.stacksimplify.restservices.exceptions;

public class UserNameNotFoundException extends Exception{
    private static final Long serialVersionUid = 1L;

    public UserNameNotFoundException(String message) {
        super(message);
    }
}

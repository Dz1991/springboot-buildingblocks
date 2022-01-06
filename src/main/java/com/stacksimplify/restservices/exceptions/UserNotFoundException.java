package com.stacksimplify.restservices.exceptions;

public class UserNotFoundException extends Exception {
    private static final Long serialVersionUid = 1L;

    public UserNotFoundException(String message) {
        super(message);
    }
}

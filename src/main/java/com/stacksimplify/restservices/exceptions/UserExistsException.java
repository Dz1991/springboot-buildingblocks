package com.stacksimplify.restservices.exceptions;

public class UserExistsException extends Exception{
    private static final Long serialVersionUid = 2L;

    public UserExistsException(String message) {
        super(message);
    }
}

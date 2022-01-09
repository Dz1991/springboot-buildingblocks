package com.stacksimplify.restservices.exceptions;

public class OrderNotFoundException extends Exception{
    private static final Long serialVersionUid = 1L;

    public OrderNotFoundException(String message) {
        super(message);
    }
}

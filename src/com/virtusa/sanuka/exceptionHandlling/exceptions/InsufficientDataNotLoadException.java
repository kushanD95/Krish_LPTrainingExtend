package com.virtusa.sanuka.exceptionHandlling.exceptions;

public class InsufficientDataNotLoadException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InsufficientDataNotLoadException(String message, Exception e) {
        super(message, e);
    }
}

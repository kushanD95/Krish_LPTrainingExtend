package com.sanuka.exception_handlling.exceptions;

public class VehicleConditionException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleConditionException(String message, Exception ex) {
        super(message, ex);
    }
}

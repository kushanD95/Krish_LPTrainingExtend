package com.sanuka.exception_handlling.exceptions;

public class VehicleIsNotAvailableException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleIsNotAvailableException(String message, Exception ex) {

        super(message, ex);
    }
}

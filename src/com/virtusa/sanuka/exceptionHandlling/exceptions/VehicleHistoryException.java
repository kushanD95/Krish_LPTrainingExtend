package com.virtusa.sanuka.exceptionHandlling.exceptions;

public class VehicleHistoryException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleHistoryException(String message, Exception ex) {
        super(message, ex);
    }
}

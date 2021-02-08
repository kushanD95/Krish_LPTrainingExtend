package com.sanuka.exception_handlling.exceptions;

public class VehicleHistoryException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleHistoryException(String message, Exception ex) {
        super(message, ex);
    }
}

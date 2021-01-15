package com.virtusa.sanuka.exceptionHandlling.exceptions;

import java.io.FileNotFoundException;

public class VehicleDataNotFoundException extends FileNotFoundException {

    private static final long serialVersionUID = 1L;

    public VehicleDataNotFoundException(String message) {

        super(message);
    }

}

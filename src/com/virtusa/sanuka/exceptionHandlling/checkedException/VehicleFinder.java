package com.virtusa.sanuka.exceptionHandlling.checkedException;

import com.virtusa.sanuka.exceptionHandlling.exceptions.VehicleDataNotFoundException;
import com.virtusa.sanuka.exceptionHandlling.usedVehicleBuyerSystem.VehicleBookStoreKeeper;

public class VehicleFinder {

    public static void main(String[] args) {
        try {
            VehicleBookStoreKeeper vehicleBookStoreKeeper = new VehicleBookStoreKeeper();
            vehicleBookStoreKeeper.findVehicleByNumber("BCD 0000");
        } catch (VehicleDataNotFoundException e) {
            System.err.print(e.getMessage());
            //e.printStackTrace();
        }
    }
}

package com.virtusa.sanuka.exception_handlling.checked_exception;

import com.virtusa.sanuka.exception_handlling.exceptions.VehicleDataNotFoundException;
import com.virtusa.sanuka.exception_handlling.used_vehicle_buyer_system.VehicleBookStoreKeeper;

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

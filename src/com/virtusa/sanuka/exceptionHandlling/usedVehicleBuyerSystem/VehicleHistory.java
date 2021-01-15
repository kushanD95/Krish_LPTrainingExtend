package com.virtusa.sanuka.exceptionHandlling.usedVehicleBuyerSystem;


import com.virtusa.sanuka.exceptionHandlling.exceptions.VehicleDataNotFoundException;
import com.virtusa.sanuka.exceptionHandlling.exceptions.VehicleHistoryException;

public class VehicleHistory {
    public static void getVehicleHistory(int vehicleSelector) throws VehicleHistoryException {
        try {
            VehicleBookStoreKeeper vehicleBookStoreKeeper = new VehicleBookStoreKeeper();
            vehicleBookStoreKeeper.getVehicleBook(vehicleSelector);
        } catch (VehicleDataNotFoundException e) {
            throw new VehicleHistoryException("Vehicle History data is not available", e);
        }
    }
}

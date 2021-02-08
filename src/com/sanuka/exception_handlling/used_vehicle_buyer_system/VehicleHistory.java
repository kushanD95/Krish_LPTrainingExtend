package com.sanuka.exception_handlling.used_vehicle_buyer_system;


import com.sanuka.exception_handlling.exceptions.VehicleDataNotFoundException;
import com.sanuka.exception_handlling.exceptions.VehicleHistoryException;

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

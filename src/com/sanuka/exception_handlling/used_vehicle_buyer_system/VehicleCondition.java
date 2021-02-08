package com.sanuka.exception_handlling.used_vehicle_buyer_system;


import com.sanuka.exception_handlling.exceptions.VehicleConditionException;
import com.sanuka.exception_handlling.exceptions.VehicleHistoryException;

public class VehicleCondition {

    public static void getCondition(int vehicleSelector) throws VehicleConditionException {
        try {
            VehicleHistory.getVehicleHistory(vehicleSelector);
        } catch (VehicleHistoryException e) {
            throw new VehicleConditionException("Vehicle condition details are not available", e);
        }

    }
}

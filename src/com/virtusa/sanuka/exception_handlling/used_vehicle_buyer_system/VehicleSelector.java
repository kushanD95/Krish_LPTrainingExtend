package com.virtusa.sanuka.exception_handlling.used_vehicle_buyer_system;


import com.virtusa.sanuka.exception_handlling.exceptions.VehicleConditionException;
import com.virtusa.sanuka.exception_handlling.exceptions.VehicleIsNotAvailableException;

public class VehicleSelector {


    public static void selectOneVehicle(int vehicleSelector,String VehicleType) throws VehicleIsNotAvailableException {
        try {
            VehicleCondition vehicleCondition = new VehicleCondition();
            vehicleCondition.getCondition(vehicleSelector);
        } catch (VehicleConditionException e) {
            throw new VehicleIsNotAvailableException(VehicleType + "s are not for sale", e);
        }

    }
}

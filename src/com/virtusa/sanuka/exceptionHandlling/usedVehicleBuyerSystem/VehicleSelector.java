package com.virtusa.sanuka.exceptionHandlling.usedVehicleBuyerSystem;


import com.virtusa.sanuka.exceptionHandlling.exceptions.VehicleConditionException;
import com.virtusa.sanuka.exceptionHandlling.exceptions.VehicleIsNotAvailableException;

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

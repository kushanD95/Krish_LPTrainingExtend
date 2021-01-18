package com.virtusa.sanuka.exceptionHandlling.stackTrace;


import com.virtusa.sanuka.exceptionHandlling.exceptions.VehicleIsNotAvailableException;
import com.virtusa.sanuka.exceptionHandlling.usedVehicleBuyerSystem.VehicleSelector;

import java.util.HashMap;
import java.util.Scanner;

public class UsedVehicleBuyer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vehicleType;
        HashMap vehicleTypes = UsedVehicleBuyer.setVehicles();
        System.out.println("Enter the vehicle type\n (Auto-car type can use for test exceptions)");

        vehicleTypes.forEach((key,value)-> System.out.println(key + " - " + value));

        vehicleType = scanner.nextInt();

        try {
            VehicleSelector vehicleSelector = new VehicleSelector();
            vehicleSelector.selectOneVehicle(vehicleType,vehicleTypes.get(vehicleType).toString());
            System.out.println(vehicleTypes.get(vehicleType).toString() + "s have to sale");
        } catch (VehicleIsNotAvailableException e) {
            e.printStackTrace();
        }

    }

    private static HashMap<Integer,String> setVehicles() {

        HashMap vehicleTypes = new HashMap();

        vehicleTypes.put(1,"Manual-car");
        vehicleTypes.put(2,"Auto-car");
        vehicleTypes.put(3,"Van");
        vehicleTypes.put(4,"Bike");

        return vehicleTypes;
    }
}

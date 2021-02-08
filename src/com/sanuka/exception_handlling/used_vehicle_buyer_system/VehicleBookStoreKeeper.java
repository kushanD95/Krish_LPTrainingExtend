package com.sanuka.exception_handlling.used_vehicle_buyer_system;


import com.sanuka.exception_handlling.exceptions.VehicleDataNotFoundException;

import java.util.HashMap;

public class VehicleBookStoreKeeper {

    HashMap<Integer,Integer> vehicleBookStore;
    VehicleBookStoreKeeper vehicleBookStoreKeeper;

    public VehicleBookStoreKeeper() {
        vehicleBookStore = new HashMap();
        this.getNumberOfVehicles();

    }

    public void getVehicleBook(int vehicleSelector) throws VehicleDataNotFoundException {

        VehicleBookStoreKeeper vehicleBookStoreKeeper = new VehicleBookStoreKeeper();
        if(this.vehicleBookStore.get(vehicleSelector) > 0 ) {

            System.out.println("books are found");

        } else {
            throw new VehicleDataNotFoundException("Book not available..");
        }
    }

    private void getNumberOfVehicles() {
        this.vehicleBookStore.put(1,5);
        this.vehicleBookStore.put(2,0);
        this.vehicleBookStore.put(3,6);
        this.vehicleBookStore.put(4,9);
    }

    public void findVehicleByNumber(String number) throws VehicleDataNotFoundException {
        if(number.equals("ABC 000")) {
            System.out.println("vehicle found");
        } else {
            throw new VehicleDataNotFoundException(number + " Vehicle not found");
        }
    }

    public void registerVehicleOwnName(String citizenship) {

        if(citizenship.equals("y")) {
            System.out.println("Yes, you can register vehicle with you own");
        } else if(citizenship.equals("n")) {
            System.out.println("No, You cannot register vehicle with your own name");
        } else {
            throw new  IllegalArgumentException("Please if the answer is Yes enter 'y' or if it is No enter 'n' ");
        }

    }
}

package com.virtusa.sanuka.exception_handlling.unchecked_exception;

import com.virtusa.sanuka.exception_handlling.used_vehicle_buyer_system.VehicleBookStoreKeeper;

import java.util.Scanner;

public class VehicleRegistrationVerifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String citizenship;
        System.out.println("To register a vehicle the to your own name you must a Sri Lankan citizen.\n\t Are you a srilankan:" +
                "\n\tIf yes press 'y' otherwise press 'n'");
        citizenship = scanner.nextLine();

            VehicleBookStoreKeeper vehicleBookStoreKeeper = new VehicleBookStoreKeeper();
            vehicleBookStoreKeeper.registerVehicleOwnName(citizenship);
    }
}

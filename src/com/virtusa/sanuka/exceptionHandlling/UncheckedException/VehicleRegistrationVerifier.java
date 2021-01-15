package com.virtusa.sanuka.exceptionHandlling.UncheckedException;

import com.virtusa.sanuka.exceptionHandlling.usedVehicleBuyerSystem.VehicleBookStoreKeeper;

import java.util.Scanner;

public class VehicleRegistrationVerifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String citizenship;
        System.out.println("To register a vehicle the to your own name you must a Sri Lankan citizen.\n\t Are you a srilankan:" +
                "\n\tIf yes press 'y' otherwise press 'n'");
        citizenship = scanner.nextLine();

        try{
            VehicleBookStoreKeeper vehicleBookStoreKeeper = new VehicleBookStoreKeeper();
            vehicleBookStoreKeeper.registerVehicleOwnName(citizenship);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();;
        }
    }
}

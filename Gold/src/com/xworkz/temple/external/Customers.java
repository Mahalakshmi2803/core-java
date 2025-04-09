package com.xworkz.temple.external;

import com.xworkz.temple.internal.Garage;

public class Customers {
    public Customers() {
        System.out.println("no-args constructor of Visitor");
    }

    public void visitGarage() {
        System.out.println("visitGarage running in Visitor");
        Garage garage = new Garage();

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Total Vehicles: " + garage.getTotalVehicles());
        System.out.println("Is Open: " + garage.getOpenNow());
        System.out.println("Service Charge: " + garage.getServiceCharge());
        System.out.println("Workers: " + garage.getWorkers());
    }
}


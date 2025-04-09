package com.xworkz.temple.internal;

public class Mechanic {
    public Mechanic() {
        System.out.println("no-args constructor of Mechanic");
    }

    public void showGarageDetails() {
        System.out.println("showGarageDetails running in Mechanic");
        Garage garage = new Garage();

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Total Vehicles: " + garage.getTotalVehicles());
        System.out.println("Is Open: " + garage.getOpenNow());
        System.out.println("Service Charge: " + garage.getServiceCharge());
        System.out.println("Workers: " + garage.getWorkers());

        garage.setName("FastFix");
        garage.setTotalVehicles(35);
        garage.setOpenNow(false);
        garage.setServiceCharge(2000.0);
        garage.setWorkers( 8);

        System.out.println("Updated Garage Name: " + garage.getName());
        System.out.println("Updated Total Vehicles: " + garage.getTotalVehicles());
        System.out.println("Updated Is Open: " + garage.getOpenNow());
        System.out.println("Updated Service Charge: " + garage.getServiceCharge());
        System.out.println("Updated Workers: " + garage.getWorkers());
    }
}


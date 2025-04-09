package com.xworkz.temple.external;

import com.xworkz.temple.internal.Apartment;

public class Tenant {
    public Tenant() {
        System.out.println("no-args constructor of Tenant");
    }

    public void checkApartment() {
        System.out.println("Running checkApartment in Tenant");
        Apartment apartment = new Apartment();

        System.out.println("Owner Name: " + apartment.getOwnerName());
        System.out.println("Flat Number: " + apartment.getFlatNumber());
        System.out.println("Has Parking: " + apartment.getHasParking());
        System.out.println("Rent Amount: " + apartment.getRentAmount());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
    }
}


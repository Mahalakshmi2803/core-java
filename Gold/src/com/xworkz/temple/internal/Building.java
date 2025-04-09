package com.xworkz.temple.internal;

public class Building {
    public Building() {
        System.out.println("no-args constructor of Building");
    }

    public void showApartmentDetails() {
        System.out.println("Running showApartmentDetails in Building");
        Apartment apartment = new Apartment();

        System.out.println("Owner Name: " + apartment.getOwnerName());
        System.out.println("Flat Number: " + apartment.getFlatNumber());
        System.out.println("Has Parking: " + apartment.getHasParking());
        System.out.println("Rent Amount: " + apartment.getRentAmount());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());

        apartment.setOwnerName("Priya");
        apartment.setFlatNumber(205);
        apartment.setHasParking(false);
        apartment.setRentAmount(950.75);
        apartment.setNumberOfRooms( 3);

        System.out.println("Updated Owner Name: " + apartment.getOwnerName());
        System.out.println("Updated Flat Number: " + apartment.getFlatNumber());
        System.out.println("Updated Has Parking: " + apartment.getHasParking());
        System.out.println("Updated Rent Amount: " + apartment.getRentAmount());
        System.out.println("Updated Number of Rooms: " + apartment.getNumberOfRooms());
    }
}


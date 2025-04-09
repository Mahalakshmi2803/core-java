package com.xworkz.temple.internal;

public class Apartment {
    private String ownerName = "Rahul";
    private int flatNumber = 101;
    private boolean hasParking = true;
    private double rentAmount = 850.00;
    private int numberOfRooms = 2;

    public Apartment() {
        System.out.println("no-args constructor of Apartment");
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public boolean getHasParking() {
        return hasParking;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}


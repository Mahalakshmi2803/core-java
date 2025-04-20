package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Car {
    private String model;
    private double price;
    private boolean isAutomatic;
    private int seats;

    public Car(String model, double price, boolean isAutomatic, int seats) {
        this.model = model;
        this.price = price;
        this.isAutomatic = isAutomatic;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + "', price=" + price + ", isAutomatic=" + isAutomatic + ", seats=" + seats + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car other = (Car) obj;
            if (Objects.equals(this.model, other.model) && this.seats == other.seats) {
                System.out.println("Car is matching..");
                return true;
            }
        }
        return false;
    }
}


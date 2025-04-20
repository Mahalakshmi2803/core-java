package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Vehicle {
    private String model;
    private int year;
    private boolean isElectric;
    private double price;

    public Vehicle(String model, int year, boolean isElectric, double price) {
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model='" + model + '\'' + ", year=" + year + ", isElectric=" + isElectric + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            if (Objects.equals(this.model, other.model) && this.year == other.year) {
                System.out.println("Vehicle is matching..");
                return true;
            }
        }
        return false;
    }
}


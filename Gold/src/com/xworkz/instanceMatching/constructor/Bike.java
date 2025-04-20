package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Bike {
    private int gears;
    private String brand;
    private double cost;
    private boolean isElectric;

    public Bike(int gears, String brand, double cost, boolean isElectric) {
        this.gears = gears;
        this.brand = brand;
        this.cost = cost;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Bike{" + "gears=" + gears + ", brand='" + brand + "', cost=" + cost + ", isElectric=" + isElectric + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bike) {
            Bike other = (Bike) obj;
            if (this.gears == other.gears && Objects.equals(this.brand, other.brand)) {
                System.out.println("Bike is matching..");
                return true;
            }
        }
        return false;
    }
}


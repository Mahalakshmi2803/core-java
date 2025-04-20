package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Lock {
    private int pins;
    private boolean isDigital;
    private double weight;
    private String brand;

    public Lock(int pins, boolean isDigital, double weight, String brand) {
        this.pins = pins;
        this.isDigital = isDigital;
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Lock{" + "pins=" + pins + ", isDigital=" + isDigital + ", weight=" + weight + ", brand='" + brand + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lock) {
            Lock other = (Lock) obj;
            if (this.pins == other.pins && Objects.equals(this.brand, other.brand)) {
                System.out.println("Lock is matching..");
                return true;
            }
        }
        return false;
    }
}


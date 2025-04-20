package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Laptop {
    private double price;
    private boolean hasTouchScreen;
    private String brand;
    private int ramSize;

    public Laptop() {
        System.out.println("no argument constructor of Laptop...");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Laptop{" + "price=" + price + ", hasTouchScreen=" + hasTouchScreen + ", brand=" + brand + ", ramSize=" + ramSize + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            Laptop other = (Laptop) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    this.ramSize == other.ramSize) {
                System.out.println("Laptop is matching..");
                return true;
            }
        }
        return false;
    }
}


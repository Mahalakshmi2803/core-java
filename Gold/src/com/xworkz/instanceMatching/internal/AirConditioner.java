package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class AirConditioner {
    private String model;
    private int capacity;
    private double price;
    private boolean hasHeater;

    public AirConditioner() {
        System.out.println("no argument constructor of AirConditioner...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasHeater(boolean hasHeater) {
        this.hasHeater = hasHeater;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "model=" + model +
                ", capacity=" + capacity +
                ", price=" + price +
                ", hasHeater=" + hasHeater +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AirConditioner) {
            AirConditioner other = (AirConditioner) obj;
            if (Objects.equals(this.model, other.model) &&
                    this.capacity == other.capacity) {
                System.out.println("AirConditioner is matching..");
                return true;
            }
        }
        return false;
    }
}

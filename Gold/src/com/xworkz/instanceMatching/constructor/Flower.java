package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Flower {
    private String type;
    private int petals;
    private boolean isFragrant;
    private double price;

    public Flower(String type, int petals, boolean isFragrant, double price) {
        this.type = type;
        this.petals = petals;
        this.isFragrant = isFragrant;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" + "type='" + type + "', petals=" + petals + ", isFragrant=" + isFragrant + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Flower) {
            Flower other = (Flower) obj;
            if (Objects.equals(this.type, other.type) && this.petals == other.petals) {
                System.out.println("Flower is matching..");
                return true;
            }
        }
        return false;
    }
}


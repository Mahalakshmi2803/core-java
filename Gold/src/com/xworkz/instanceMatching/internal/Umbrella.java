package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Umbrella {
    private String color;
    private boolean isAutomatic;
    private double price;
    private int length;

    public Umbrella() {
        System.out.println("no argument constructor of Umbrella...");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Umbrella{" + "color=" + color + ", isAutomatic=" + isAutomatic + ", price=" + price + ", length=" + length + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Umbrella) {
            Umbrella other = (Umbrella) obj;
            if (Objects.equals(this.color, other.color) &&
                    this.length == other.length) {
                System.out.println("Umbrella is matching..");
                return true;
            }
        }
        return false;
    }
}


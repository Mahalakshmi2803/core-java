package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Hat {
    private double size;
    private String brand;
    private boolean isAdjustable;
    private int price;

    public Hat() {
        System.out.println("no argument constructor of Hat...");
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsAdjustable(boolean isAdjustable) {
        this.isAdjustable = isAdjustable;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hat{" + "size=" + size + ", brand=" + brand + ", isAdjustable=" + isAdjustable + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hat) {
            Hat other = (Hat) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    this.price == other.price) {
                System.out.println("Hat is matching..");
                return true;
            }
        }
        return false;
    }
}


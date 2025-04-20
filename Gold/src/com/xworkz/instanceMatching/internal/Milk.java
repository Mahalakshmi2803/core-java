package com.xworkz.instanceMatching.internal;

import java.util.Objects;



public class Milk {
    private double fatContent;
    private String brand;
    private boolean isOrganic;
    private int quantity;

    public Milk() {
        System.out.println("no argument constructor of Milk...");
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fatContent=" + fatContent +
                ", brand='" + brand + '\'' +
                ", isOrganic=" + isOrganic +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Milk) {
            Milk other = (Milk) obj;
            if (Objects.equals(this.fatContent, other.fatContent) &&
                    Objects.equals(this.brand, other.brand)) {
                System.out.println("Milk is matching..");
                return true;
            }
        }
        return false;
    }
}












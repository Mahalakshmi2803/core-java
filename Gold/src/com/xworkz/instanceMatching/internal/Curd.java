package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Curd {
    private String flavor;
    private boolean probiotic;
    private int quantity;
    private double price;

    public Curd() {
        System.out.println("no argument constructor of Curd...");
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setProbiotic(boolean probiotic) {
        this.probiotic = probiotic;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Curd{" +
                "flavor='" + flavor + '\'' +
                ", probiotic=" + probiotic +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Curd) {
            Curd other = (Curd) obj;
            if (Objects.equals(this.flavor, other.flavor) && this.quantity == other.quantity) {
                System.out.println("Curd is matching..");
                return true;
            }
        }
        return false;
    }
}

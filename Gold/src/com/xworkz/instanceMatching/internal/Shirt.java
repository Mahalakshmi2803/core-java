package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Shirt {
    private String size;
    private double price;
    private String color;
    private String brand;

    public Shirt() {
        System.out.println("no argument constructor of Shirt...");
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size=" + size +
                ", price=" + price +
                ", color=" + color +
                ", brand=" + brand +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shirt) {
            Shirt other = (Shirt) obj;
            if (Objects.equals(this.size, other.size) &&
                    Objects.equals(this.price, other.price)) {
                System.out.println("Shirt is matching..");
                return true;
            }
        }
        return false;
    }
}


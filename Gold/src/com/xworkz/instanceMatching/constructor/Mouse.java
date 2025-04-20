package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Mouse {
    private String brand;
    private boolean isWireless;
    private double price;
    private String color;

    public Mouse(String brand, boolean isWireless, double price, String color) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse{" + "brand='" + brand + "', isWireless=" + isWireless + ", price=" + price + ", color='" + color + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mouse) {
            Mouse other = (Mouse) obj;
            if (Objects.equals(this.brand, other.brand) && this.isWireless == other.isWireless) {
                System.out.println("Mouse is matching..");
                return true;
            }
        }
        return false;
    }
}


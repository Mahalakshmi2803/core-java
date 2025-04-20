package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Calculator {
private boolean isScientific;
private String model;
private double price;
private int warranty;

public Calculator() {
    System.out.println("no argument constructor of Calculator...");
}

public void setScientific(boolean scientific) {
    isScientific = scientific;
}

public void setModel(String model) {
    this.model = model;
}

public void setPrice(double price) {
    this.price = price;
}

public void setWarranty(int warranty) {
    this.warranty = warranty;
}

@Override
public String toString() {
    return "Calculator{" +
            "isScientific=" + isScientific +
            ", model='" + model + '\'' +
            ", price=" + price +
            ", warranty=" + warranty +
            '}';
}

@Override
public boolean equals(Object obj) {
    if (obj instanceof Calculator) {
        Calculator other = (Calculator) obj;
        if (Objects.equals(this.model, other.model) && Objects.equals(this.price, other.price)) {
            System.out.println("Calculator is matching..");
            return true;
        }
    }
    return false;
}
}

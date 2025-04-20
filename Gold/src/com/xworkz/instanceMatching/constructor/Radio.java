package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Radio {
    private boolean hasBluetooth;
    private String brand;
    private int batteryLife;
    private double frequencyRange;

    public Radio(boolean hasBluetooth, String brand, int batteryLife, double frequencyRange) {
        this.hasBluetooth = hasBluetooth;
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.frequencyRange = frequencyRange;
    }

    @Override
    public String toString() {
        return "Radio{" + "hasBluetooth=" + hasBluetooth + ", brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife + ", frequencyRange=" + frequencyRange + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Radio) {
            Radio other = (Radio) obj;
            if (Objects.equals(this.brand, other.brand) && this.batteryLife == other.batteryLife) {
                System.out.println("Radio is matching..");
                return true;
            }
        }
        return false;
    }
}


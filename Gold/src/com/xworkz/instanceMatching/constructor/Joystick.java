package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Joystick {
    private int buttons;
    private String brand;
    private boolean hasVibration;
    private double weight;

    public Joystick(int buttons, String brand, boolean hasVibration, double weight) {
        this.buttons = buttons;
        this.brand = brand;
        this.hasVibration = hasVibration;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Joystick{" + "buttons=" + buttons + ", brand='" + brand + "', hasVibration=" + hasVibration + ", weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Joystick) {
            Joystick other = (Joystick) obj;
            if (this.buttons == other.buttons && Objects.equals(this.brand, other.brand)) {
                System.out.println("Joystick is matching..");
                return true;
            }
        }
        return false;
    }
}


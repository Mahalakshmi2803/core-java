package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Fan {
    private int speed;
    private boolean isRemoteControlled;
    private String brand;
    private double height;

    public Fan() {
        System.out.println("no argument constructor of Fan...");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRemoteControlled(boolean remoteControlled) {
        isRemoteControlled = remoteControlled;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", isRemoteControlled=" + isRemoteControlled +
                ", brand=" + brand +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fan) {
            Fan other = (Fan) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    this.speed == other.speed) {
                System.out.println("Fan is matching..");
                return true;
            }
        }
        return false;
    }
}


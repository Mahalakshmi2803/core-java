package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Box {
    private String material;
    private int volume;
    private boolean isReusable;
    private double price;

    public Box() {
        System.out.println("no argument constructor of Box...");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Box{" +
                "material=" + material +
                ", volume=" + volume +
                ", isReusable=" + isReusable +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Box) {
            Box other = (Box) obj;
            if (Objects.equals(this.material, other.material) &&
                    this.volume == other.volume) {
                System.out.println("Box is matching..");
                return true;
            }
        }
        return false;
    }
}


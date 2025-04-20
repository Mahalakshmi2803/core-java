package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Mask {
    private boolean isReusable;
    private double price;
    private String material;
    private int layers;

    public Mask() {
        System.out.println("no argument constructor of Mask...");
    }

    public void setReusable(boolean reusable) {
        isReusable = reusable;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    @Override
    public String toString() {
        return "Mask{" +
                "isReusable=" + isReusable +
                ", price=" + price +
                ", material=" + material +
                ", layers=" + layers +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mask) {
            Mask other = (Mask) obj;
            if (Objects.equals(this.material, other.material) &&
                    this.layers == other.layers) {
                System.out.println("Mask is matching..");
                return true;
            }
        }
        return false;
    }
}


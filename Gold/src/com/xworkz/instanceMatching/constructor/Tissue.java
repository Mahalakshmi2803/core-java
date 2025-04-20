package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Tissue {
    private double length;
    private boolean isSoft;
    private int layers;
    private String brand;

    public Tissue(double length, boolean isSoft, int layers, String brand) {
        this.length = length;
        this.isSoft = isSoft;
        this.layers = layers;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tissue{" + "length=" + length + ", isSoft=" + isSoft + ", layers=" + layers + ", brand='" + brand + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tissue) {
            Tissue other = (Tissue) obj;
            if (this.length == other.length && Objects.equals(this.brand, other.brand)) {
                System.out.println("Tissue is matching..");
                return true;
            }
        }
        return false;
    }
}


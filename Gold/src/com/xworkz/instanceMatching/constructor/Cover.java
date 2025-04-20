package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Cover {
    private String material;
    private boolean isWaterproof;
    private double size;
    private int price;

    public Cover(String material, boolean isWaterproof, double size, int price) {
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cover{" + "material='" + material + "', isWaterproof=" + isWaterproof + ", size=" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cover) {
            Cover other = (Cover) obj;
            if (Objects.equals(this.material, other.material) && this.price == other.price) {
                System.out.println("Cover is matching..");
                return true;
            }
        }
        return false;
    }
}


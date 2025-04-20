package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Key {
    private String material;
    private double length;
    private boolean isDuplicate;
    private int teethCount;

    public Key(String material, double length, boolean isDuplicate, int teethCount) {
        this.material = material;
        this.length = length;
        this.isDuplicate = isDuplicate;
        this.teethCount = teethCount;
    }

    @Override
    public String toString() {
        return "Key{" + "material='" + material + '\'' + ", length=" + length + ", isDuplicate=" + isDuplicate + ", teethCount=" + teethCount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Key) {
            Key other = (Key) obj;
            if (Objects.equals(this.material, other.material) && this.teethCount == other.teethCount) {
                System.out.println("Key is matching..");
                return true;
            }
        }
        return false;
    }
}


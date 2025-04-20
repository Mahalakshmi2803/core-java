package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Blade {
    private String brand;
    private int sharpnessLevel;
    private boolean isDisposable;
    private double length;

    public Blade() {
        System.out.println("no argument constructor of Blade...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSharpnessLevel(int sharpnessLevel) {
        this.sharpnessLevel = sharpnessLevel;
    }

    public void setDisposable(boolean disposable) {
        isDisposable = disposable;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Blade{" +
                "brand='" + brand + '\'' +
                ", sharpnessLevel=" + sharpnessLevel +
                ", isDisposable=" + isDisposable +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Blade) {
            Blade other = (Blade) obj;
            if (Objects.equals(this.brand, other.brand) && this.sharpnessLevel == other.sharpnessLevel) {
                System.out.println("Blade is matching..");
                return true;
            }
        }
        return false;
    }
}

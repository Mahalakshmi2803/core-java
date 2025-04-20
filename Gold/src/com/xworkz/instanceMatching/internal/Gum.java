package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Gum {
    private int count;
    private String flavor;
    private double weight;
    private boolean sugarFree;

    public Gum() {
        System.out.println("no argument constructor of Gum...");
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    @Override
    public String toString() {
        return "Gum{" +
                "count=" + count +
                ", flavor='" + flavor + '\'' +
                ", weight=" + weight +
                ", sugarFree=" + sugarFree +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Gum) {
            Gum other = (Gum) obj;
            if (Objects.equals(this.flavor, other.flavor) && this.count == other.count) {
                System.out.println("Gum is matching..");
                return true;
            }
        }
        return false;
    }
}

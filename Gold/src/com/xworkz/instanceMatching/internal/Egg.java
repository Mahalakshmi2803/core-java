package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Egg {
    private int count;
    private String type;
    private boolean isOrganic;
    private double weight;

    public Egg() {
        System.out.println("no argument constructor of Egg...");
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Egg{" + "count=" + count + ", type=" + type + ", isOrganic=" + isOrganic + ", weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Egg) {
            Egg other = (Egg) obj;
            if (Objects.equals(this.type, other.type) &&
                    this.count == other.count) {
                System.out.println("Egg is matching..");
                return true;
            }
        }
        return false;
    }
}


package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Ghee {
    private boolean isPure;
    private double weight;
    private String source;
    private int price;

    public Ghee() {
        System.out.println("no argument constructor of Ghee...");
    }

    public void setPure(boolean pure) {
        isPure = pure;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ghee{" +
                "isPure=" + isPure +
                ", weight=" + weight +
                ", source='" + source + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ghee) {
            Ghee other = (Ghee) obj;
            if (Objects.equals(this.source, other.source) && this.weight == other.weight) {
                System.out.println("Ghee is matching..");
                return true;
            }
        }
        return false;
    }
}

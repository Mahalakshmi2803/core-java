package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Animal {
    private int legs;
    private boolean isWild;
    private String species;
    private double weight;

    public Animal(int legs, boolean isWild, String species, double weight) {
        this.legs = legs;
        this.isWild = isWild;
        this.species = species;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" + "legs=" + legs + ", isWild=" + isWild + ", species='" + species + "', weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal other = (Animal) obj;
            if (this.legs == other.legs && Objects.equals(this.species, other.species)) {
                System.out.println("Animal is matching..");
                return true;
            }
        }
        return false;
    }
}

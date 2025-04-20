package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Zebra {
    private String name;
    private int age;
    private double weight;
    private boolean isWild;

    public Zebra() {
        System.out.println("no argument constructor of Zebra...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setIsWild(boolean isWild) {
        this.isWild = isWild;
    }

    @Override
    public String toString() {
        return "Zebra{" + "name=" + name + ", age=" + age + ", weight=" + weight + ", isWild=" + isWild + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Zebra) {
            Zebra other = (Zebra) obj;
            if (Objects.equals(this.name, other.name) &&
                    this.age == other.age) {
                System.out.println("Zebra is matching..");
                return true;
            }
        }
        return false;
    }
}


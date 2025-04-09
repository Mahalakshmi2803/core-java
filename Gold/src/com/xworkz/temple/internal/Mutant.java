package com.xworkz.temple.internal;
public class Mutant {
    private String name = "Storm";
    private int age = 35;
    private boolean strong = true;
    private double powerLevel = 88.5;
    private int claws = 0;

    public Mutant() {
        System.out.println("no-args constructor of Mutant");
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setStrong(boolean strong) {
        this.strong = strong;
    }

    void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }

    void setClaws(int claws) {
        this.claws = claws;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getStrong() {
        return strong;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public int getClaws() {
        return claws;
    }
}


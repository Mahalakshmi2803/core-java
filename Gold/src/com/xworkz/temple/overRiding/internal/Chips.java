package com.xworkz.temple.overRiding.internal;

public class Chips extends Snack {
    public Chips() {
        System.out.println("Chips constructor");
    }

    @Override
    public void eat() {
        System.out.println("Eating Chips");
    }

    public void addFlavor() {
        System.out.println("Adding flavor to Chips");
    }
}



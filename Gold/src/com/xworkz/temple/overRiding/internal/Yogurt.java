package com.xworkz.temple.overRiding.internal;

public class Yogurt extends Curd {
    public Yogurt() {
        System.out.println("Yogurt constructor");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Yogurt");
    }

    public void addFruit() {
        System.out.println("Adding fruit to Yogurt");
    }
}




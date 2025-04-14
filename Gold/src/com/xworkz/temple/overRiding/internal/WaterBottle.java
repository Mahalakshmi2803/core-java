package com.xworkz.temple.overRiding.internal;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        System.out.println("WaterBottle constructor");
    }
    @Override
    public void use() {
        System.out.println("Using WaterBottle");
    }
    public void fill() {
        System.out.println("Filling WaterBottle");
    }
}



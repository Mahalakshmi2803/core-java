package com.xworkz.temple.overRiding.internal;

public class SportsCar extends Car {
    public SportsCar() {
        System.out.println("SportsCar constructor");
    }
    @Override
    public void drive() {
        System.out.println("SportsCar is driving fast");
    }
    public void turboBoost() {
        System.out.println("SportsCar turbo boost activated");
    }
}



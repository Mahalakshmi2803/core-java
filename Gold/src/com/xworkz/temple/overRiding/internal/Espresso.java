package com.xworkz.temple.overRiding.internal;

public class Espresso extends Coffee {
    public Espresso() {
        System.out.println("Espresso constructor");
    }

    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }

    public void addSugar() {
        System.out.println("Adding sugar to Espresso");
    }
}




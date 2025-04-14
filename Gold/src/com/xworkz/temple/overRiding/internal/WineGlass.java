package com.xworkz.temple.overRiding.internal;

public class WineGlass extends Glass {
    public WineGlass() {
        System.out.println("WineGlass constructor");
    }
    @Override
    public void fill() {
        System.out.println("Filling WineGlass");
    }
    public void swirl() {
        System.out.println("Swirling in WineGlass");
    }
}



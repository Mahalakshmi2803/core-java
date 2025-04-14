package com.xworkz.temple.overRiding.internal;

public class WaterColor extends Color {
    public WaterColor() {
        System.out.println("WaterColor constructor");
    }
    @Override
    public void fill() {
        System.out.println("Filling with WaterColor");
    }
    public void spread() {
        System.out.println("Spreading WaterColor");
    }
}



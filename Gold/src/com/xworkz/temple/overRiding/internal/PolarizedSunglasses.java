package com.xworkz.temple.overRiding.internal;

public class PolarizedSunglasses extends Sunglasses {
    public PolarizedSunglasses() {
        System.out.println("PolarizedSunglasses constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing polarized sunglasses");
    }
    public void reduceGlare() {
        System.out.println("Reducing glare");
    }
}



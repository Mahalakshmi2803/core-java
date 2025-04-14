package com.xworkz.temple.overRiding.internal;

public class SunglassesUser {
    public SunglassesUser() {
        System.out.println("SunglassesUser constructor");
    }
    public void show(Sunglasses glasses) {
        if (glasses != null) {
            glasses.wear();
            if (glasses instanceof PolarizedSunglasses) {
                PolarizedSunglasses pg = (PolarizedSunglasses) glasses;
                pg.reduceGlare();
            } else {
                System.out.println("Sunglasses are not polarized");
            }
        } else {
            System.out.println("Sunglasses are null");
        }
    }
}

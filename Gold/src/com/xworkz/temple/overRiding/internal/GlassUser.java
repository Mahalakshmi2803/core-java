package com.xworkz.temple.overRiding.internal;

public class GlassUser {
    public GlassUser() {
        System.out.println("GlassUser constructor");
    }
    public void show(Glass glass) {
        if (glass != null) {
            glass.fill();
            if (glass instanceof WineGlass) {
                WineGlass wg = (WineGlass) glass;
                wg.swirl();
            } else {
                System.out.println("Glass is not WineGlass");
            }
        } else {
            System.out.println("Glass is null");
        }
    }
}
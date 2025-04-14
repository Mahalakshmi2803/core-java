package com.xworkz.temple.overRiding.internal;

public class SunUser {
    public SunUser() {
        System.out.println("SunUser constructor");
    }
    public void show(Sun sun) {
        if (sun != null) {
            sun.shine();
            if (sun instanceof RedGiantSun) {
                RedGiantSun rg = (RedGiantSun) sun;
                rg.expand();
            } else {
                System.out.println("Sun is not a RedGiantSun");
            }
        } else {
            System.out.println("Sun is null");
        }
    }
}

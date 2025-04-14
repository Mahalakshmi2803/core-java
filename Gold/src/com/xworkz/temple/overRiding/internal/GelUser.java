package com.xworkz.temple.overRiding.internal;

public class GelUser {
    public GelUser() {
        System.out.println("GelUser constructor");
    }
    public void show(Gel gel) {
        if (gel != null) {
            gel.apply();
            if (gel instanceof HairGel) {
                HairGel hg = (HairGel) gel;
                hg.style();
            } else {
                System.out.println("Gel is not HairGel");
            }
        } else {
            System.out.println("Gel is null");
        }
    }
}

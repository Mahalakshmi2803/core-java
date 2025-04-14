package com.xworkz.temple.overRiding.internal;

public class TowelUser {
    public TowelUser() {
        System.out.println("TowelUser constructor");
    }
    public void show(Towel towel) {
        if (towel != null) {
            towel.wipe();
            if (towel instanceof BathTowel) {
                ((BathTowel) towel).absorbWater();
            } else {
                System.out.println("Towel is not a BathTowel");
            }
        } else {
            System.out.println("Towel is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class BathTowel extends Towel {
    public BathTowel() {
        System.out.println("BathTowel constructor");
    }
    @Override
    public void wipe() {
        System.out.println("BathTowel is wiping gently");
    }
    public void absorbWater() {
        System.out.println("BathTowel is absorbing water");
    }
}



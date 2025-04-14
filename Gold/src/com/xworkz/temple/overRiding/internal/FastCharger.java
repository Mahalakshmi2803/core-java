package com.xworkz.temple.overRiding.internal;

public class FastCharger extends Charger {
    public FastCharger() {
        System.out.println("FastCharger constructor");
    }
    @Override
    public void charge() {
        System.out.println("Fast charging device");
    }
    public void quickCharge() {
        System.out.println("QuickCharge enabled");
    }
}



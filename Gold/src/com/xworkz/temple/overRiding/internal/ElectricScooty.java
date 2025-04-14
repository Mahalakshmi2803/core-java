package com.xworkz.temple.overRiding.internal;

public class ElectricScooty extends Scooty {
    public ElectricScooty() {
        System.out.println("ElectricScooty constructor");
    }
    @Override
    public void ride() {
        System.out.println("ElectricScooty is riding silently");
    }
    public void charge() {
        System.out.println("Charging ElectricScooty");
    }
}



package com.xworkz.temple.internal;

public class Revolver extends Weapon {

    public Revolver() {
        System.out.println("no arg constructor of Revolver");
    }

    public void useRevolver() {
        System.out.println("useRevolver running in Revolver");

        Weapon weapon = new Weapon();
        Tool tool = new Weapon();
    }
}

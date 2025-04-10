package com.xworkz.temple.internal;

public class Weapon extends Tool {

    public Weapon() {
        System.out.println("no arg constructor of Weapon");
    }

    public void useWeapon() {
        System.out.println("useWeapon running in Weapon");

        Tool tool = new Tool();
    }
}

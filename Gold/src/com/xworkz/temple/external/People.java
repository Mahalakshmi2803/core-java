package com.xworkz.temple.external;

import com.xworkz.temple.internal.Tank;

public class People {
    public People() {
        System.out.println("People are watching.");
    }

    public void seeTank() {
        System.out.println("Seeing the Tank from People...");
        Tank tank = new Tank();

        System.out.println("Tank Name: " + tank.getName());
        System.out.println("Tank Type: " + tank.getType());
        System.out.println("Tank Age: " + tank.getAge());
        System.out.println("Tank Fuel: " + tank.getFuel());
        System.out.println("Tank Weapon: " + tank.getWeapon());
    }
}


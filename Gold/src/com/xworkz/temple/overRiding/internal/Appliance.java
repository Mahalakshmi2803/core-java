package com.xworkz.temple.overRiding.internal;

public class Appliance {
    public void show(Fan fan) {
        if (fan != null) {
            fan.use();
            if (fan instanceof CeilingFan) {
                ((CeilingFan) fan).rotate();
            } else {
                System.out.println("Not a CeilingFan");
            }
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class AeroplaneUser {
    public AeroplaneUser() {
        System.out.println("AeroplaneUser constructor");
    }
    public void show(Aeroplane a) {
        if (a != null) {
            a.fly();
            if (a instanceof PassengerPlane) {
                PassengerPlane p = (PassengerPlane) a;
                p.serveFood();
            } else {
                System.out.println("Not a PassengerPlane");
            }
        } else {
            System.out.println("Aeroplane is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class PassengerPlane extends Aeroplane {
    public PassengerPlane() {
        System.out.println("PassengerPlane constructor");
    }
    @Override
    public void fly() {
        System.out.println("PassengerPlane flying with passengers");
    }
    public void serveFood() {
        System.out.println("Serving food in PassengerPlane");
    }
}



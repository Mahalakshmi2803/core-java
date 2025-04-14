package com.xworkz.temple.overRiding.internal;

public class RoadUser {
    public RoadUser() {
        System.out.println("RoadUser constructor");
    }
    public void show(Road road) {
        if (road != null) {
            road.drive();
            if (road instanceof Highway) {
                Highway hw = (Highway) road;
                hw.speedLimit();
            } else {
                System.out.println("Road is not Highway");
            }
        } else {
            System.out.println("Road is null");
        }
    }
}

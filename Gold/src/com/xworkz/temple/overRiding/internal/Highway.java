package com.xworkz.temple.overRiding.internal;

public class Highway extends Road {
    public Highway() {
        System.out.println("Highway constructor");
    }
    @Override
    public void drive() {
        System.out.println("Driving on the Highway");
    }
    public void speedLimit() {
        System.out.println("Speed limit on the Highway");
    }
}



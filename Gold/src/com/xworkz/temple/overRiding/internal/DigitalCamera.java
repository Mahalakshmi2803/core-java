package com.xworkz.temple.overRiding.internal;

public class DigitalCamera extends Camera {
    public DigitalCamera() {
        System.out.println("DigitalCamera constructor");
    }
    @Override
    public void click() {
        System.out.println("DigitalCamera is clicking");
    }
    public void record() {
        System.out.println("DigitalCamera is recording");
    }
}



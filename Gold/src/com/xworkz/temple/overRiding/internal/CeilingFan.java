package com.xworkz.temple.overRiding.internal;

public class CeilingFan extends Fan {
    public CeilingFan() {
        System.out.println("CeilingFan constructor");
    }
    @Override
    public void use() {
        System.out.println("Using CeilingFan");
    }
    public void rotate() {
        System.out.println("Rotating CeilingFan");
    }
}



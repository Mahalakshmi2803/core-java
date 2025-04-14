package com.xworkz.temple.overRiding.internal;

public class Ipad extends Tablet {
    public Ipad() {
        System.out.println("iPad constructor");
    }
    @Override
    public void browse() {
        System.out.println("Browsing on iPad");
    }
    public void touch() {
        System.out.println("Touching the iPad screen");
    }
}



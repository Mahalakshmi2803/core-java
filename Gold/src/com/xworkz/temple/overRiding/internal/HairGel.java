package com.xworkz.temple.overRiding.internal;

public class HairGel extends Gel {
    public HairGel() {
        System.out.println("HairGel constructor");
    }
    @Override
    public void apply() {
        System.out.println("Applying HairGel");
    }
    public void style() {
        System.out.println("Styling with HairGel");
    }
}



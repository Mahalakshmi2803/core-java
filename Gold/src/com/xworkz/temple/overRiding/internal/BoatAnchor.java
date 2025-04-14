package com.xworkz.temple.overRiding.internal;

public class BoatAnchor extends Anchor {
    public BoatAnchor() {
        System.out.println("BoatAnchor constructor");
    }

    @Override
    public void hold() {
        System.out.println("BoatAnchor is holding");
    }

    public void drop() {
        System.out.println("Dropping BoatAnchor");
    }
}



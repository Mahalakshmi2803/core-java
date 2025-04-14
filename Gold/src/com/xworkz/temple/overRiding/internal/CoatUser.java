package com.xworkz.temple.overRiding.internal;

public class CoatUser extends Coat {
    public CoatUser() {
        System.out.println("CoatUser constructor");
    }
    public void show(Coat c) {
        if (c != null) {
            c.wear();
            if (c instanceof WinterCoat) {
                WinterCoat wc = (WinterCoat) c;
                wc.zipUp();
            } else {
                System.out.println("Not a WinterCoat");
            }
        } else {
            System.out.println("Coat is null");
        }
    }
}
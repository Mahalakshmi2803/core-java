package com.xworkz.temple.overRiding.internal;

public class TapUser {
    public TapUser() {
        System.out.println("TapUser constructor");
    }
    public void show(Tap tap) {
        if (tap != null) {
            tap.flow();
            if (tap instanceof KitchenTap) {
                KitchenTap kt = (KitchenTap) tap;
                kt.filter();
            } else {
                System.out.println("Tap is not KitchenTap");
            }
        } else {
            System.out.println("Tap is null");
        }
    }
}

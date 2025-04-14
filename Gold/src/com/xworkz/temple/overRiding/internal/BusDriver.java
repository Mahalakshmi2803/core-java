package com.xworkz.temple.overRiding.internal;

public class BusDriver {
    public BusDriver() {
        System.out.println("BusDriver constructor");
    }
    public void show(Bus bus) {
        if (bus != null) {
            bus.drive();
            if (bus instanceof DoubleDeckerBus) {
                DoubleDeckerBus db = (DoubleDeckerBus) bus;
                db.openTopDeck();
            } else {
                System.out.println("Bus is not a DoubleDeckerBus");
            }
        } else {
            System.out.println("Bus is null");
        }
    }
}

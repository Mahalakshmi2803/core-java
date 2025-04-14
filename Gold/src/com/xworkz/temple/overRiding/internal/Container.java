package com.xworkz.temple.overRiding.internal;

public class Container {
    public void show(Bottle bottle) {
        if (bottle != null) {
            bottle.use();
            if (bottle instanceof WaterBottle) {
                ((WaterBottle) bottle).fill();
            } else {
                System.out.println("Not a WaterBottle");
            }
        }
    }
}

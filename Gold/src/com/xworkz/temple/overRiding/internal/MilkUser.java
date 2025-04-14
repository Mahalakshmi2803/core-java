package com.xworkz.temple.overRiding.internal;

public class MilkUser {
    public MilkUser() {
        System.out.println("MilkUser constructor");
    }

    public void show(Milk milk) {
        if (milk != null) {
            milk.pour();
            if (milk instanceof AlmondMilk) {
                AlmondMilk almondMilk = (AlmondMilk) milk;
                almondMilk.addSweetener();
            } else {
                System.out.println("Milk is not AlmondMilk");
            }
        } else {
            System.out.println("Milk is null");
        }
    }
}
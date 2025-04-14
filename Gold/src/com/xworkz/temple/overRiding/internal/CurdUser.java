package com.xworkz.temple.overRiding.internal;

public class CurdUser {
    public CurdUser() {
        System.out.println("CurdUser constructor");
    }

    public void show(Curd curd) {
        if (curd != null) {
            curd.prepare();
            if (curd instanceof Yogurt) {
                Yogurt yogurt = (Yogurt) curd;
                yogurt.addFruit();
            } else {
                System.out.println("Curd is not Yogurt");
            }
        } else {
            System.out.println("Curd is null");
        }
    }
}

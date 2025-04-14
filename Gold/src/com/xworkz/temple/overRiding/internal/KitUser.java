package com.xworkz.temple.overRiding.internal;

public class KitUser {
    public KitUser() {
        System.out.println("KitUser constructor");
    }
    public void show(Kit kit) {
        if (kit != null) {
            kit.use();
            if (kit instanceof FirstAidKit) {
                ((FirstAidKit) kit).applyBandage();
            } else {
                System.out.println("Kit is not a FirstAidKit");
            }
        } else {
            System.out.println("Kit is null");
        }
    }
}


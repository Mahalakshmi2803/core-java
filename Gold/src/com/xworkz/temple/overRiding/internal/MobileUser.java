package com.xworkz.temple.overRiding.internal;

public class MobileUser {
    public MobileUser() {
        System.out.println("MobileUser constructor");
    }
    public void show(Mobile mobile) {
        if (mobile != null) {
            mobile.call();
            if (mobile instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) mobile;
                smartphone.browse();
            } else {
                System.out.println("Mobile is not a Smartphone");
            }
        } else {
            System.out.println("Mobile is null");
        }
    }
}

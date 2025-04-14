package com.xworkz.temple.overRiding.internal;

public class LipstickUser {
    public LipstickUser() {
        System.out.println("LipstickUser constructor");
    }
    public void show(Lipstick lipstick) {
        if (lipstick != null) {
            lipstick.apply();
            if (lipstick instanceof MatteLipstick) {
                ((MatteLipstick) lipstick).setLongLasting();
            } else {
                System.out.println("Lipstick is not a MatteLipstick");
            }
        } else {
            System.out.println("Lipstick is null");
        }
    }
}

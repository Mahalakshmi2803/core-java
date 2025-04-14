package com.xworkz.temple.overRiding.internal;

public class BatUser {
    public BatUser() {
        System.out.println("BatUser constructor");
    }
    public void show(Bat bat) {
        if (bat != null) {
            bat.hit();
            if (bat instanceof CricketBat) {
                CricketBat cricketBat = (CricketBat) bat;
                cricketBat.swing();
            } else {
                System.out.println("Bat is not CricketBat");
            }
        } else {
            System.out.println("Bat is null");
        }
    }
}

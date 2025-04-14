package com.xworkz.temple.overRiding.internal;

public class CricketUser {
    public CricketUser() {
        System.out.println("CricketUser constructor");
    }
    public void show(Cricket cricket) {
        if (cricket != null) {
            cricket.play();
            if (cricket instanceof StreetCricket) {
                StreetCricket sc = (StreetCricket) cricket;
                sc.shout();
            } else {
                System.out.println("Cricket is not StreetCricket");
            }
        } else {
            System.out.println("Cricket is null");
        }
    }
}

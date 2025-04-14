package com.xworkz.temple.overRiding.internal;

public class StarUser {
    public StarUser() {
        System.out.println("StarUser constructor");
    }
    public void show(Star star) {
        if (star != null) {
            star.twinkle();
            if (star instanceof ShootingStar) {
                ShootingStar ss = (ShootingStar) star;
                ss.shootAcrossSky();
            } else {
                System.out.println("Star is not a ShootingStar");
            }
        } else {
            System.out.println("Star is null");
        }
    }
}

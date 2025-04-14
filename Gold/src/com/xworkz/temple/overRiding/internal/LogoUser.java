package com.xworkz.temple.overRiding.internal;

public class LogoUser {
    public LogoUser() {
        System.out.println("LogoUser constructor");
    }
    public void show(Logo logo) {
        if (logo != null) {
            logo.display();
            if (logo instanceof AnimatedLogo) {
                AnimatedLogo al = (AnimatedLogo) logo;
                al.animate();
            } else {
                System.out.println("Logo is not AnimatedLogo");
            }
        } else {
            System.out.println("Logo is null");
        }
    }
}

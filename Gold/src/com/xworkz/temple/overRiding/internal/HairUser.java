package com.xworkz.temple.overRiding.internal;

public class HairUser {
    public HairUser() {
        System.out.println("HairUser constructor");
    }
    public void show(Hair hair) {
        if (hair != null) {
            hair.grow();
            if (hair instanceof CurlyHair) {
                CurlyHair ch = (CurlyHair) hair;
                ch.bounce();
            } else {
                System.out.println("Hair is not CurlyHair");
            }
        } else {
            System.out.println("Hair is null");
        }
    }
}

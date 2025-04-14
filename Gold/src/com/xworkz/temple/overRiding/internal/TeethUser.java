package com.xworkz.temple.overRiding.internal;

public
class TeethUser {
    public TeethUser() {
        System.out.println("TeethUser constructor");
    }
    public void show(Teeth teeth) {
        if (teeth != null) {
            teeth.chew();
            if (teeth instanceof WisdomTeeth) {
                WisdomTeeth wt = (WisdomTeeth) teeth;
                wt.hurt();
            } else {
                System.out.println("Teeth are not WisdomTeeth");
            }
        } else {
            System.out.println("Teeth are null");
        }
    }
}

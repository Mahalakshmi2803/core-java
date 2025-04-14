package com.xworkz.temple.overRiding.internal;

public class WisdomTeeth extends Teeth {
    public WisdomTeeth() {
        System.out.println("WisdomTeeth constructor");
    }
    @Override
    public void chew() {
        System.out.println("WisdomTeeth are chewing");
    }
    public void hurt() {
        System.out.println("WisdomTeeth are hurting");
    }
}

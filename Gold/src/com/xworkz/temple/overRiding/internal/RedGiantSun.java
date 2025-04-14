package com.xworkz.temple.overRiding.internal;

public class RedGiantSun extends Sun {
    public RedGiantSun() {
        System.out.println("RedGiantSun constructor");
    }
    @Override
    public void shine() {
        System.out.println("Red Giant Sun is glowing massively");
    }
    public void expand() {
        System.out.println("Red Giant Sun is expanding");
    }
}



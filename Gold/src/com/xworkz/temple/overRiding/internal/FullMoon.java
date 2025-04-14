package com.xworkz.temple.overRiding.internal;

public class FullMoon extends Moon {
    public FullMoon() {
        System.out.println("FullMoon constructor");
    }
    @Override
    public void glow() {
        System.out.println("Full Moon is glowing brightly");
    }
    public void shineBrightly() {
        System.out.println("Full Moon is shining brightly");
    }
}



package com.xworkz.temple.overRiding.internal;

public class StreetCricket extends Cricket {
    public StreetCricket() {
        System.out.println("StreetCricket constructor");
    }
    @Override
    public void play() {
        System.out.println("Playing StreetCricket");
    }
    public void shout() {
        System.out.println("Shouting while playing StreetCricket");
    }
}



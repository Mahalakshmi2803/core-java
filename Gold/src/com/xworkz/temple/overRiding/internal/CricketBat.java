package com.xworkz.temple.overRiding.internal;

public class CricketBat extends Bat {
    public CricketBat() {
        System.out.println("CricketBat constructor");
    }
    @Override
    public void hit() {
        System.out.println("CricketBat is hitting");
    }
    public void swing() {
        System.out.println("Swinging the CricketBat");
    }
}

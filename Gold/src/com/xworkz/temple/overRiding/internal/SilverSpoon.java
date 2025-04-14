package com.xworkz.temple.overRiding.internal;

public class SilverSpoon extends Spoon {
    public SilverSpoon() {
        System.out.println("SilverSpoon constructor");
    }
    @Override
    public void scoop() {
        System.out.println("Scooping elegantly with SilverSpoon");
    }
    public void shine() {
        System.out.println("SilverSpoon shines brightly");
    }
}



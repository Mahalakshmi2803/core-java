package com.xworkz.temple.overRiding.internal;

public class Wardrobe extends Cupboard {
    public Wardrobe() {
        System.out.println("Wardrobe constructor");
    }
    @Override
    public void open() {
        System.out.println("Opening Wardrobe");
    }
    public void store() {
        System.out.println("Storing clothes in Wardrobe");
    }
}



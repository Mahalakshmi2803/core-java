package com.xworkz.temple.overRiding.internal;

public class SilkCloth extends Cloth {
    public SilkCloth() {
        System.out.println("SilkCloth constructor");
    }

    @Override
    public void wear() {
        System.out.println("Wearing SilkCloth");
    }

    public void shine() {
        System.out.println("SilkCloth is shining");
    }
}

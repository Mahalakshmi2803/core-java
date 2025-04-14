package com.xworkz.temple.overRiding.internal;

public class WinterCoat extends Coat {
    public WinterCoat() {
        System.out.println("WinterCoat constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing warm WinterCoat");
    }
    public void zipUp() {
        System.out.println("Zipping WinterCoat");
    }
}



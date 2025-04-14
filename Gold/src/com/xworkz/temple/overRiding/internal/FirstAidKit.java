package com.xworkz.temple.overRiding.internal;

public class FirstAidKit extends Kit {
    public FirstAidKit() {
        System.out.println("FirstAidKit constructor");
    }
    @Override
    public void use() {
        System.out.println("Using FirstAidKit");
    }
    public void applyBandage() {
        System.out.println("Applying bandage from FirstAidKit");
    }
}



package com.xworkz.temple.overRiding.internal;

public class MobileCover extends Cover {
    public MobileCover() {
        System.out.println("MobileCover constructor");
    }
    @Override
    public void protect() {
        System.out.println("Protecting mobile with MobileCover");
    }
    public void personalize() {
        System.out.println("Personalizing MobileCover");
    }
}


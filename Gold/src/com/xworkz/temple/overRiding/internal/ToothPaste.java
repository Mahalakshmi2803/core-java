package com.xworkz.temple.overRiding.internal;

public class ToothPaste extends Paste {
    public ToothPaste() {
        System.out.println("ToothPaste constructor");
    }
    @Override
    public void squeeze() {
        System.out.println("Squeezing ToothPaste");
    }
    public void whitenTeeth() {
        System.out.println("ToothPaste whitens teeth");
    }
}



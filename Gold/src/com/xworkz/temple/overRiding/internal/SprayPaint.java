package com.xworkz.temple.overRiding.internal;

public class SprayPaint extends Paint {
    public SprayPaint() {
        System.out.println("SprayPaint constructor");
    }
    @Override
    public void apply() {
        System.out.println("Applying SprayPaint");
    }
    public void spray() {
        System.out.println("Spraying SprayPaint");
    }
}


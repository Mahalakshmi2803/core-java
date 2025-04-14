package com.xworkz.temple.overRiding.internal;

public class YogaMat extends Mat {
    public YogaMat() {
        System.out.println("YogaMat constructor");
    }
    @Override
    public void use() {
        System.out.println("Using YogaMat");
    }
    public void rollUp() {
        System.out.println("Rolling up YogaMat");
    }
}



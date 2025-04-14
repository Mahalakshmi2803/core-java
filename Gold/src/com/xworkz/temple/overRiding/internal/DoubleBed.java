package com.xworkz.temple.overRiding.internal;

public class DoubleBed extends Bed {
    public DoubleBed() {
        System.out.println("DoubleBed constructor");
    }
    @Override
    public void use() {
        System.out.println("Using DoubleBed");
    }
    public void spreadSheet() {
        System.out.println("Spreading sheet on DoubleBed");
    }
}



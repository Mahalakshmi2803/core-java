package com.xworkz.temple.overRiding.internal;

public class LabRat extends Rat {
    public LabRat() {
        System.out.println("LabRat constructor");
    }
    @Override
    public void use() {
        System.out.println("Using LabRat");
    }
    public void test() {
        System.out.println("Testing LabRat");
    }
}



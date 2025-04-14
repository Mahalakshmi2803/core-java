package com.xworkz.temple.overRiding.internal;

public class BedSheet extends Sheet {
    public BedSheet() {
        System.out.println("BedSheet constructor");
    }
    @Override
    public void place() {
        System.out.println("Placing BedSheet properly");
    }
    public void iron() {
        System.out.println("Ironing the BedSheet");
    }
}



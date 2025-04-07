package com.xworkz.temple.internal;

public class PowderBox {
    public PowderBox() {
        System.out.println("no-args constructor of PowderBox");
    }

    public void store() {
        System.out.println("store running in PowderBox");
        Powder powder = new Powder();
        powder.dissolve();
        powder.color();
    }
}


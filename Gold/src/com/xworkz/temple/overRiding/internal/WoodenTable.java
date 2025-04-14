package com.xworkz.temple.overRiding.internal;

public class WoodenTable extends Table {
    public WoodenTable() {
        System.out.println("WoodenTable constructor");
    }
    @Override
    public void use() {
        System.out.println("Using WoodenTable");
    }
    public void polish() {
        System.out.println("Polishing WoodenTable");
    }
}



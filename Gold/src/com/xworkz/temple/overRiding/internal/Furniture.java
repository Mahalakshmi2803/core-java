package com.xworkz.temple.overRiding.internal;

public class Furniture {
    public void show(Table table) {
        if (table != null) {
            table.use();
            if (table instanceof WoodenTable) {
                ((WoodenTable) table).polish();
            } else {
                System.out.println("Not a WoodenTable");
            }
        }
    }
}

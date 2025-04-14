package com.xworkz.temple.overRiding.internal;

public class BagUser {
    public BagUser() {
        System.out.println("BagUser constructor");
    }
    public void show(Bag bag) {
        if (bag != null) {
            bag.use();
            if (bag instanceof SchoolBag) {
                SchoolBag sb = (SchoolBag) bag;
                sb.carrySnacks();
            } else {
                System.out.println("Bag is not a SchoolBag");
            }
        } else {
            System.out.println("Bag is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class KitchenTap extends Tap {
    public KitchenTap() {
        System.out.println("KitchenTap constructor");
    }
    @Override
    public void flow() {
        System.out.println("Water flowing from KitchenTap");
    }
    public void filter() {
        System.out.println("KitchenTap filters water");
    }
}



package com.xworkz.temple.overRiding.internal;

public class GroceryBill extends Bill {
    public GroceryBill() {
        System.out.println("GroceryBill constructor");
    }
    @Override
    public void generate() {
        System.out.println("Generating detailed Grocery Bill");
    }
    public void applyDiscounts() {
        System.out.println("Applying discounts on GroceryBill");
    }
}



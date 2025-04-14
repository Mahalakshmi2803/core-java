package com.xworkz.temple.overRiding.internal;

public class BillUser {
    public BillUser() {
        System.out.println("BillUser constructor");
    }
    public void show(Bill bill) {
        if (bill != null) {
            bill.generate();
            if (bill instanceof GroceryBill) {
                GroceryBill gb = (GroceryBill) bill;
                gb.applyDiscounts();
            } else {
                System.out.println("Bill is not a GroceryBill");
            }
        } else {
            System.out.println("Bill is null");
        }
    }
}

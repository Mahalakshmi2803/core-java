package com.xworkz.temple.overRiding.internal;

public class ShirtUser {
    public ShirtUser() {
        System.out.println("ShirtUser constructor");
    }
    public void show(Shirt shirt) {
        if (shirt != null) {
            shirt.wear();
            if (shirt instanceof T_shirt) {
                T_shirt tshirt = (T_shirt) shirt;
                tshirt.style();
            } else {
                System.out.println("Shirt is not TShirt");
            }
        } else {
            System.out.println("Shirt is null");
        }
    }
}

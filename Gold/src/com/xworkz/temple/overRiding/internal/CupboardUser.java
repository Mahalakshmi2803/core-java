package com.xworkz.temple.overRiding.internal;

public class CupboardUser {
    public CupboardUser() {
        System.out.println("CupboardUser constructor");
    }
    public void show(Cupboard cupboard) {
        if (cupboard != null) {
            cupboard.open();
            if (cupboard instanceof Wardrobe) {
                Wardrobe wardrobe = (Wardrobe) cupboard;
                wardrobe.store();
            } else {
                System.out.println("Cupboard is not Wardrobe");
            }
        } else {
            System.out.println("Cupboard is null");
        }
    }
}

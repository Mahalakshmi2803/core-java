package com.xworkz.temple.overRiding.internal;

public
class PantUser extends Pant {
    public PantUser() {
        System.out.println("PantUser constructor");
    }
    public void show(Pant p) {
        if (p != null) {
            p.wear();
            if (p instanceof Jeans) {
                Jeans j = (Jeans) p;
                j.matchShirt();
            } else {
                System.out.println("Not a Jeans");
            }
        } else {
            System.out.println("Pant is null");
        }
    }
}

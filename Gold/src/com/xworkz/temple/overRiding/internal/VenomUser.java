package com.xworkz.temple.overRiding.internal;

public class VenomUser {
    public VenomUser() {
        System.out.println("VenomUser constructor");
    }

    public void show(Venom venom) {
        if (venom != null) {
            venom.poison();
            if (venom instanceof CobraVenom) {
                CobraVenom cobra = (CobraVenom) venom;
                cobra.kill();
            } else {
                System.out.println("Venom is not CobraVenom");
            }
        } else {
            System.out.println("Venom is null");
        }
    }
}


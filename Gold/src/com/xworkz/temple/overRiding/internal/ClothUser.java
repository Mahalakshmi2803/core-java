package com.xworkz.temple.overRiding.internal;

public class ClothUser {
    public ClothUser() {
        System.out.println("ClothUser constructor");
    }

    public void show(Cloth cloth) {
        if (cloth != null) {
            cloth.wear();
            if (cloth instanceof SilkCloth) {
                SilkCloth silkCloth = (SilkCloth) cloth;
                silkCloth.shine();
            } else {
                System.out.println("Cloth is not SilkCloth");
            }
        } else {
            System.out.println("Cloth is null");
        }
    }
}

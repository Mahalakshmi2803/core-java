package com.xworkz.temple.overRiding.internal;

public class SharpenerUser {
    public SharpenerUser() {
        System.out.println("SharpenerUser constructor");
    }
    public void show(Sharpener sharpener) {
        if (sharpener != null) {
            sharpener.sharpenPencil();
            if (sharpener instanceof MetalSharpener) {
                MetalSharpener ms = (MetalSharpener) sharpener;
                ms.oilBlades();
            } else {
                System.out.println("Sharpener is not a MetalSharpener");
            }
        } else {
            System.out.println("Sharpener is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class TshirtUser extends Tshirt {
    public TshirtUser() {
        System.out.println("TshirtUser constructor");
    }
    public void show(Tshirt t) {
        if (t != null) {
            t.wear();
            if (t instanceof PrintedTshirt) {
                PrintedTshirt pt = (PrintedTshirt) t;
                pt.showDesign();
            } else {
                System.out.println("Not a PrintedTshirt");
            }
        } else {
            System.out.println("Tshirt is null");
        }
    }
}

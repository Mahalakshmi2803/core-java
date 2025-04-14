package com.xworkz.temple.overRiding.internal;

public class PencilUser {
    public void show(Pencil p) {
        if (p != null) {
            p.draw();
            if (p instanceof HBPencil ) {
                HBPencil hb = (HBPencil) p;
                hb.sharpen();
            } else {
                System.out.println("Not a HBPencil");
            }
        } else {
            System.out.println("Pencil is null");
        }
    }
}

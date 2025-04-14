package com.xworkz.temple.overRiding.internal;

public class Research {
    public void show(Rat rat) {
        if (rat != null) {
            rat.use();
            if (rat instanceof LabRat) {
                ((LabRat) rat).test();
            } else {
                System.out.println("Not a LabRat");
            }
        }
    }
}

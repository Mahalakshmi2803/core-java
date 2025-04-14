package com.xworkz.temple.overRiding.internal;

public class Bedroom {
    public void show(Bed bed) {
        if (bed != null) {
            bed.use();
            if (bed instanceof DoubleBed) {
                ((DoubleBed) bed).spreadSheet();
            } else {
                System.out.println("Not a DoubleBed");
            }
        }
    }
}

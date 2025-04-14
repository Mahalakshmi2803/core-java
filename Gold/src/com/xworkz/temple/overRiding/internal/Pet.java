package com.xworkz.temple.overRiding.internal;

public class Pet {
    public void show(Cat cat) {
        if (cat != null) {
            cat.use();
            if (cat instanceof PersianCat) {
                ((PersianCat) cat).purr();
            } else {
                System.out.println("Not a PersianCat");
            }
        }
    }
}

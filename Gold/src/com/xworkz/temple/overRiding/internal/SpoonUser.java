package com.xworkz.temple.overRiding.internal;

public class SpoonUser {
public SpoonUser() {
    System.out.println("SpoonUser constructor");
}
public void show(Spoon spoon) {
    if (spoon != null) {
        spoon.scoop();
        if (spoon instanceof SilverSpoon) {
            SilverSpoon ss = (SilverSpoon) spoon;
            ss.shine();
        } else {
            System.out.println("Spoon is not SilverSpoon");
        }
    } else {
        System.out.println("Spoon is null");
    }
}
}

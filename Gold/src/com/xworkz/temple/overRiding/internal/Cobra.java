package com.xworkz.temple.overRiding.internal;

public class Cobra extends Snake {
    public Cobra() {
        System.out.println("Cobra constructor");
    }

    @Override
    public void slither() {
        System.out.println("Cobra is slithering");
    }

    public void bite() {
        System.out.println("Cobra is biting");
    }
}




package com.xworkz.temple.overRiding.internal;

public class SoftToy extends Toy {
    public SoftToy() {
        System.out.println("SoftToy constructor");
    }
    @Override
    public void play() {
        System.out.println("Playing gently with SoftToy");
    }
    public void cuddle() {
        System.out.println("Cuddling the SoftToy");
    }
}



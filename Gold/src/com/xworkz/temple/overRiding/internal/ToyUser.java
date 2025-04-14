package com.xworkz.temple.overRiding.internal;

public class ToyUser {
    public ToyUser() {
        System.out.println("ToyUser constructor");
    }
    public void show(Toy toy) {
        if (toy != null) {
            toy.play();
            if (toy instanceof SoftToy) {
                SoftToy st = (SoftToy) toy;
                st.cuddle();
            } else {
                System.out.println("Toy is not a SoftToy");
            }
        } else {
            System.out.println("Toy is null");
        }
    }
}

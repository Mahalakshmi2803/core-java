package com.xworkz.temple.internal;

public class Sneakers extends Shoe {

    public Sneakers() {
        System.out.println("no-arg constructor of Sneaker");
    }

    public void wearSneakers() {
        System.out.println("wearSneakers running in Sneakers");

        Shoes shoes = new Shoes();
        Accessory accessory = new Shoes();
    }
}
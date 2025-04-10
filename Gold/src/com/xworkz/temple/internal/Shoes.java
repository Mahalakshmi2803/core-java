package com.xworkz.temple.internal;

public class Shoes extends Accessory {

    public Shoes() {
        System.out.println("no-arg constructor of Shoes");
    }

    public void wearShoes() {
        System.out.println("wearShoes on a shoes");

        Accessory accessory = new Accessory();
    }
}

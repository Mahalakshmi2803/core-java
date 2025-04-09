package com.xworkz.temple.internal;

public class Shop {
    public Shop() {
        System.out.println("no-args constructor of Shop");
    }

    public void displayKeyChain() {
        System.out.println("displayKeyChain running in Shop");
        KeyChain keyChain = new KeyChain();

        System.out.println("KeyChain Color: " + keyChain.getColor());
        System.out.println("KeyChain Shape: " + keyChain.getShape());
        System.out.println("KeyChain Size: " + keyChain.getSize());
        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("KeyChain Brand: " + keyChain.getBrand());

        keyChain.setColor("Black");
        keyChain.setShape("Square");
        keyChain.setSize(7);
        keyChain.setMaterial("Plastic");
        keyChain.setBrand("KeyBuddy");

        System.out.println("Updated KeyChain Color: " + keyChain.getColor());
        System.out.println("Updated KeyChain Shape: " + keyChain.getShape());
        System.out.println("Updated KeyChain Size: " + keyChain.getSize());
        System.out.println("Updated KeyChain Material: " + keyChain.getMaterial());
        System.out.println("Updated KeyChain Brand: " + keyChain.getBrand());
    }
}

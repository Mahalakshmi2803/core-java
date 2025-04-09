package com.xworkz.temple.external;

import com.xworkz.temple.internal.KeyChain;

public class Customer {
    public Customer() {
        System.out.println("no-args constructor of Customer");
    }

    public void checkKeyChain() {
        System.out.println("checkKeyChain running in Customer");
        KeyChain keyChain = new KeyChain();

        System.out.println("KeyChain Color: " + keyChain.getColor());
        System.out.println("KeyChain Shape: " + keyChain.getShape());
        System.out.println("KeyChain Size: " + keyChain.getSize());
        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("KeyChain Brand: " + keyChain.getBrand());
    }
}


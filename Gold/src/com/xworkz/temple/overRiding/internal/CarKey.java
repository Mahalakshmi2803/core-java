package com.xworkz.temple.overRiding.internal;

public class CarKey extends Key {
    public CarKey() {
        System.out.println("CarKey constructor");
    }
    @Override
    public void use() {
        System.out.println("Using CarKey");
    }
    public void unlock() {
        System.out.println("Unlocking with CarKey");
    }
}



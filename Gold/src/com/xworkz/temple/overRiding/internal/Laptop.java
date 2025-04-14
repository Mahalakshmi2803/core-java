package com.xworkz.temple.overRiding.internal;

public class Laptop extends Computer {
    public Laptop() {
        System.out.println("Laptop constructor");
    }
    @Override
    public void work() {
        System.out.println("Laptop is working");
    }
    public void portable() {
        System.out.println("Laptop is portable");
    }
}



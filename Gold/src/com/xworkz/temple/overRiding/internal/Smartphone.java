package com.xworkz.temple.overRiding.internal;

public class Smartphone extends Mobile {
    public Smartphone() {
        System.out.println("Smartphone constructor");
    }
    @Override
    public void call() {
        System.out.println("Smartphone is calling");
    }
    public void browse() {
        System.out.println("Browsing the internet on Smartphone");
    }
}


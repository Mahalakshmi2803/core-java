package com.xworkz.temple.overRiding.internal;

public class Jeans extends Pant {
    public Jeans() {
        System.out.println("Jeans constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing stylish Jeans");
    }
    public void matchShirt() {
        System.out.println("Matching Jeans with shirt");
    }
}


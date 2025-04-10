package com.xworkz.temple.internal;

public class Furniture extends Product {

    public Furniture() {
        System.out.println("no-arg constructor of Furniture");
    }

    public void assembleFurniture() {
        System.out.println("assembleFurniture running in furniture");

        Product product = new Product();
    }
}

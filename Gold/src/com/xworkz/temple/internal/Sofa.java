package com.xworkz.temple.internal;

public class Sofa extends Furniture {

    public Sofa() {
        System.out.println("no-arg constructor of Sofa");
    }

    public void sitOnSofa() {
        System.out.println("sitOnSofa running in Sofa");

        Furniture furniture = new Furniture();
        Product product = new Furniture();
    }
}

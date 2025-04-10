package com.xworkz.temple.internal;

public class Plant extends Thing {

    public Plant() {
        System.out.println("no-arg constructor of Plant");
    }

    public void grow() {
        System.out.println("grow is running in Plant ");

        Thing thing = new Thing();
    }
}

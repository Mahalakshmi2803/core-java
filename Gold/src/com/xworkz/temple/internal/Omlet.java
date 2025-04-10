package com.xworkz.temple.internal;

public class Omlet extends SideDish {

    public Omlet() {
        System.out.println("no arg constructor of Omlet");
    }

    public void eatOmlet() {
        System.out.println("eatOmlet running in Omlet");

        SideDish sideDish = new SideDish();
        Dish dish1 = new SideDish();

        SideDish sideDish2 = new Omlet();
        Dish dish2 = new Omlet();
    }
}

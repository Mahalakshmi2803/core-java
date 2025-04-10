package com.xworkz.temple.internal;

public class SideDish extends Dish {

    public SideDish() {
        System.out.println("no arg constructor of SideDish");
    }

    public void eatSideDish() {
        System.out.println("eatSideDish running in SideDish");

        Dish dish = new Dish();
    }
}

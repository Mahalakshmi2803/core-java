package com.xworkz.temple.overRiding.internal;

public class Pizza extends Food {
    public Pizza() {
        System.out.println("Pizza constructor");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Pizza");
    }

    public void addToppings() {
        System.out.println("Adding toppings to Pizza");
    }
}




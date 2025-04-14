package com.xworkz.temple.overRiding.internal;

public class CoffeeUser {
    public CoffeeUser() {
        System.out.println("CoffeeUser constructor");
    }

    public void show(Coffee coffee) {
        if (coffee != null) {
            coffee.brew();
            if (coffee instanceof Espresso) {
                Espresso espresso = (Espresso) coffee;
                espresso.addSugar();
            } else {
                System.out.println("Coffee is not Espresso");
            }
        } else {
            System.out.println("Coffee is null");
        }
    }
}

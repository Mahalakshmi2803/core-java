package com.xworkz.temple.overRiding.internal;

public class SnackUser {
    public SnackUser() {
        System.out.println("SnackUser constructor");
    }

    public void show(Snack snack) {
        if (snack != null) {
            snack.eat();
            if (snack instanceof Chips) {
                Chips chips = (Chips) snack;
                chips.addFlavor();
            } else {
                System.out.println("Snack is not Chips");
            }
        } else {
            System.out.println("Snack is null");
        }
    }
}
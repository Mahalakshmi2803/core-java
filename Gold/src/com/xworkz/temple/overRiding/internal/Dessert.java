package com.xworkz.temple.overRiding.internal;

public class Dessert extends Cream {

    public Dessert() {
        System.out.println("Dessert constructor is running");
    }

    public void serve(Cream cream) {
        if (cream != null) {
            cream.useCream();

            if (cream instanceof ChocolateCream) {
                ChocolateCream c = (ChocolateCream) cream;
                c.flavorInfo();
            } else {
                System.out.println("Cream is not ChocolateCream, cannot call flavorInfo");
            }

        } else {
            System.out.println("Cream is null");
        }
    }
}


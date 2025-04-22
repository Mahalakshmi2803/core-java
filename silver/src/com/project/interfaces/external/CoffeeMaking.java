package com.project.interfaces.external;

import com.project.interfaces.internal.Coffee;

public class CoffeeMaking implements Coffee {

    @Override
    public void coffeePowder() {
        System.out.println("coffeePowder running in CoffeeMaking");
    }

    @Override
    public void milk() {
        System.out.println("milk running in CoffeeMaking");
    }

    @Override
    public void mug() {
        System.out.println("mug running in CoffeeMaking");
    }

    @Override
    public void sugar() {
        System.out.println("sugar running in CoffeeMaking");
    }

    @Override
    public void water() {
        System.out.println("water running in CoffeeMaking");
    }
}

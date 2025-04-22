package com.project.interfaces.runner;

import com.project.interfaces.external.CoffeeMaking;
import com.project.interfaces.internal.Coffee;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee=new CoffeeMaking();
        coffee.coffeePowder();
        coffee.mug();
        coffee.milk();
        coffee.sugar();
        coffee.water();
        CoffeeMaking coffeeMaking=new CoffeeMaking();
        coffeeMaking.coffeePowder();
        coffeeMaking.milk();
        coffeeMaking.mug();
        coffeeMaking.sugar();
        coffeeMaking.water();
    }
}

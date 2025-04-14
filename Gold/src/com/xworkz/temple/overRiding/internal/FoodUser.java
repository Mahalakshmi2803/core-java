package com.xworkz.temple.overRiding.internal;

public class FoodUser {
    public FoodUser() {
        System.out.println("FoodUser constructor");
    }

    public void show(Food food) {
        if (food != null) {
            food.cook();
            if (food instanceof Pizza) {
                Pizza pizza = (Pizza) food;
                pizza.addToppings();
            } else {
                System.out.println("Food is not Pizza");
            }
        } else {
            System.out.println("Food is null");
        }
    }
}

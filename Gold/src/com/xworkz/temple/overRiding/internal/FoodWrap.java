package com.xworkz.temple.overRiding.internal;

public class FoodWrap extends Wrap {
    public FoodWrap() {
        System.out.println("FoodWrap constructor");
    }
    @Override
    public void cover() {
        System.out.println("Covering food with FoodWrap");
    }
    public void preserve() {
        System.out.println("FoodWrap preserves freshness");
    }
}



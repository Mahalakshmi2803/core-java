package com.xworkz.temple.internal;

public class Coin {
    public Coin(){
        System.out.println("no-args constructor of Coin");
    }

    public void value(){
        System.out.println("value running in Coin");
        country();
    }
    void grams(){
        System.out.println("grams running in Coin");
    }

    private void country(){
        System.out.println("country running in Coin");
    }
}

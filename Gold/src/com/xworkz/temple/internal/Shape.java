package com.xworkz.temple.internal;

public class Shape {
    public Shape(){
        System.out.println("no-args constructor of Shape");
    }

    public void round(){
        System.out.println("round running in Shape");
        Coin coin=new Coin();
        coin.grams();
        coin.value();
    }
}

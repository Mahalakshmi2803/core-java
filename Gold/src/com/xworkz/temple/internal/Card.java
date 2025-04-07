package com.xworkz.temple.internal;

public class Card {

    public Card(){
        System.out.println("no-args constructor of Card");
    }

    public void bankBalance(){
        System.out.println("bankBalance running in Card");
    }

    void credit(){
        System.out.println("credit running in Card");
        deposit();
    }

    private void deposit(){
        System.out.println("deposit running in Card");
    }
}

package com.xworkz.temple.overRiding.internal;

public class DoubleDeckerBus extends Bus {
    public DoubleDeckerBus() {
        System.out.println("DoubleDeckerBus constructor");
    }
    @Override
    public void drive() {
        System.out.println("DoubleDeckerBus is driving with two levels");
    }
    public void openTopDeck() {
        System.out.println("Opening top deck of DoubleDeckerBus");
    }
}



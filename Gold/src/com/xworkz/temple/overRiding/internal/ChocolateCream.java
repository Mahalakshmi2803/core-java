package com.xworkz.temple.overRiding.internal;

public class ChocolateCream extends Cream {

    public ChocolateCream() {
        System.out.println("no-arg ChocolateCream constructor is running");
    }

    @Override
    public void useCream() {
        System.out.println("running overridden useCream method from ChocolateCream class");
    }

    public void flavorInfo() {
        System.out.println("ChocolateCream: rich and chocolaty flavor");
    }
}


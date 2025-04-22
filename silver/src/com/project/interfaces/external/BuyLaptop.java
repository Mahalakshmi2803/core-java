package com.project.interfaces.external;

import com.project.interfaces.internal.Laptop;

public class BuyLaptop implements Laptop {
    @Override
    public void color() {
        System.out.println("color running in BuyLaptop");
    }

    @Override
    public void size() {
        System.out.println("size running in BuyLaptop");
    }

    @Override
    public void cost() {
        System.out.println("cost running in BuyLaptop");
    }

    @Override
    public void brand() {
        System.out.println("brand running in BuyLaptop");
    }

    @Override
    public void graphics() {
        System.out.println("graphics running in BuyLaptop");
    }

    @Override
    public void pixel() {
        System.out.println("pixel running in BuyLaptop");
    }

    @Override
    public void processor() {
        System.out.println("processor running in BuyLaptop");
    }

    @Override
    public void storage() {
        System.out.println("storage running in BuyLaptop");
    }

    @Override
    public void store() {
        System.out.println("store running in BuyLaptop");
    }
}


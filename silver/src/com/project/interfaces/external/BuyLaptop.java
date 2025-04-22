package com.project.interfaces.external;

import com.project.interfaces.internal.Laptop;

public class BuyLaptop implements Laptop {
    public static void main(String[] args) {


        Laptop laptop = new BuyLaptop();
        laptop.brand();
        laptop.color();
        laptop.cost();
        laptop.graphics();
        laptop.pixel();
        laptop.processor();
        laptop.storage();
        laptop.store();
        laptop.size();
        BuyLaptop buyLaptop=new BuyLaptop();
        buyLaptop.brand();
        buyLaptop.color();
        buyLaptop.cost();
        buyLaptop.graphics();
        buyLaptop.pixel();
        buyLaptop.processor();
        buyLaptop.storage();
        buyLaptop.store();
        buyLaptop.size();
    }
}

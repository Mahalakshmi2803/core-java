package com.project.interfaces.runner;

import com.project.interfaces.external.BuyLaptop;
import com.project.interfaces.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new BuyLaptop();
        laptop.store();
        laptop.storage();
        laptop.processor();
        laptop.color();
        laptop.pixel();
        laptop.graphics();
        laptop.size();
        laptop.cost();
        laptop.brand();
        BuyLaptop buyLaptop=new BuyLaptop();
        buyLaptop.store();
        buyLaptop.storage();
        buyLaptop.processor();
        buyLaptop.color();
        buyLaptop.pixel();
        buyLaptop.graphics();
        buyLaptop.size();
        buyLaptop.cost();
        buyLaptop.brand();
    }
}

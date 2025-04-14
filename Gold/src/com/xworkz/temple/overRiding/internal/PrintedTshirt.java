package com.xworkz.temple.overRiding.internal;

public class PrintedTshirt extends Tshirt {
    public PrintedTshirt() {
        System.out.println("PrintedTshirt constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing PrintedTshirt");
    }
    public void showDesign() {
        System.out.println("Displaying print on Tshirt");
    }
}


package com.xworkz.temple.overRiding.internal;

public class T_shirt extends Shirt {
    public T_shirt() {
        System.out.println("TShirt constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing TShirt");
    }
    public void style() {
        System.out.println("Styling the TShirt");
    }
}



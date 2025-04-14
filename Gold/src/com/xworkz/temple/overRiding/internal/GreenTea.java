package com.xworkz.temple.overRiding.internal;

public class GreenTea extends Tea {
    public GreenTea() {
        System.out.println("GreenTea constructor");
    }

    @Override
    public void brew() {
        System.out.println("Brewing GreenTea");
    }

    public void addLemon() {
        System.out.println("Adding lemon to GreenTea");
    }
}




package com.xworkz.temple.overRiding.internal;

public class BaseballCap extends Cap {
    public BaseballCap() {
        System.out.println("BaseballCap constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing BaseballCap");
    }
    public void shadeEyes() {
        System.out.println("BaseballCap provides shade");
    }
}



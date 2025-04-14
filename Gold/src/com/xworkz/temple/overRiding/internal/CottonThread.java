package com.xworkz.temple.overRiding.internal;

public class CottonThread extends Threads {
    public CottonThread() {
        System.out.println("CottonThread constructor");
    }
    @Override
    public void bind() {
        System.out.println("Binding CottonThread");
    }
    public void stretch() {
        System.out.println("Stretching CottonThread");
    }
}



package com.xworkz.temple.overRiding.internal;

public class SlidingWindow extends Window {
    public SlidingWindow() {
        System.out.println("SlidingWindow constructor");
    }
    @Override
    public void open() {
        System.out.println("SlidingWindow is opening");
    }
    public void lock() {
        System.out.println("Locking SlidingWindow");
    }
}




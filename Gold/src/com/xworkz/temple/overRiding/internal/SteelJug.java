package com.xworkz.temple.overRiding.internal;

public class SteelJug extends Jug {
    public SteelJug() {
        System.out.println("SteelJug constructor");
    }
    @Override
    public void pour() {
        System.out.println("Pouring from SteelJug");
    }
    public void shine() {
        System.out.println("SteelJug is shining");
    }
}



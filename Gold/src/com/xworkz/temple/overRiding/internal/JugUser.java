package com.xworkz.temple.overRiding.internal;

public class JugUser {
    public JugUser() {
        System.out.println("JugUser constructor");
    }
    public void show(Jug jug) {
        if (jug != null) {
            jug.pour();
            if (jug instanceof SteelJug) {
                SteelJug sj = (SteelJug) jug;
                sj.shine();
            } else {
                System.out.println("Jug is not SteelJug");
            }
        } else {
            System.out.println("Jug is null");
        }
    }
}

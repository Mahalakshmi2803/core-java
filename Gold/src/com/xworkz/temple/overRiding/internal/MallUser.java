package com.xworkz.temple.overRiding.internal;

public class MallUser {
    public MallUser() {
        System.out.println("MallUser constructor");
    }
    public void show(Mall mall) {
        if (mall != null) {
            mall.visit();
            if (mall instanceof MegaMall) {
                MegaMall mm = (MegaMall) mall;
                mm.movieTheater();
            } else {
                System.out.println("Mall is not a MegaMall");
            }
        } else {
            System.out.println("Mall is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class CobraVenom extends Venom {
    public CobraVenom() {
        System.out.println("CobraVenom constructor");
    }

    @Override
    public void poison() {
        System.out.println("CobraVenom is extremely toxic");
    }

    public void kill() {
        System.out.println("CobraVenom can kill quickly");
    }
}



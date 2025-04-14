package com.xworkz.temple.overRiding.internal;

public class PediatricDentist extends Dentist {
    public PediatricDentist() {
        System.out.println("PediatricDentist constructor");
    }
    @Override
    public void treat() {
        System.out.println("PediatricDentist is treating");
    }
    public void treatChildren() {
        System.out.println("PediatricDentist is treating children");
    }
}



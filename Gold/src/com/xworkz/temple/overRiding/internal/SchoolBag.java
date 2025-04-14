package com.xworkz.temple.overRiding.internal;

public class SchoolBag extends Bag {
    public SchoolBag() {
        System.out.println("SchoolBag constructor");
    }
    @Override
    public void use() {
        System.out.println("Using SchoolBag with books");
    }
    public void carrySnacks() {
        System.out.println("Carrying snacks in SchoolBag");
    }
}



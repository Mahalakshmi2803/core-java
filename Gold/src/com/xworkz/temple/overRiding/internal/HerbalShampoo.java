package com.xworkz.temple.overRiding.internal;

public class HerbalShampoo extends Shampoo {
    public HerbalShampoo() {
        System.out.println("HerbalShampoo constructor");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning with HerbalShampoo");
    }
    public void fragrance() {
        System.out.println("HerbalShampoo smells good");
    }
}



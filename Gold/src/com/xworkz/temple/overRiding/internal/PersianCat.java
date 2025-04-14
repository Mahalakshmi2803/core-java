package com.xworkz.temple.overRiding.internal;

public class PersianCat extends Cat {
    public PersianCat() {
        System.out.println("PersianCat constructor");
    }
    @Override
    public void use() {
        System.out.println("Using PersianCat");
    }
    public void purr() {
        System.out.println("PersianCat is purring");
    }
}



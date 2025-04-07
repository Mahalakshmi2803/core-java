package com.xworkz.temple.internal;

public class Perfume {

    public Perfume(){
        System.out.println("no-args constructor of Perfume");
    }

    public void brand(){
        System.out.println("brand running in Perfume");
    }

    void cost(){
        System.out.println("cost running in Perfume");
        fragrance();
    }

    private void fragrance(){
        System.out.println("fragrance running in Perfume");
    }
}

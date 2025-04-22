package com.xworkz.abstractProb.internal;

public class Portable extends AbstractGadget{

    public Portable(){
        System.out.println("no-arg const in Portable");
    }

    @Override
    public void laptop() {
        super.laptop();
        System.out.println("laptop running in Portable");
    }

    @Override
    public void smartWatch() {
        System.out.println("smartWatch running in Portable");
    }
}

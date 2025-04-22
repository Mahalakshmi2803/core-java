package com.xworkz.abstractProb.internal;

public class Fruit extends AbstractMango{

    public Fruit(){
        System.out.println("no-arg constructor of Fruit");
    }

    @Override
    public void color() {

        super.color();
        System.out.println("color running in Fruit");

    }
}

package com.xworkz.abstractProb.internal;

public abstract class AbstractDress {
    int cost;

    public AbstractDress(int cost){
        this.cost=cost;
    }
    public void skirt(){
        System.out.println("skirt running in AbstractDress");

    }
}

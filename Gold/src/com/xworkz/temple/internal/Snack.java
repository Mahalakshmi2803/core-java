package com.xworkz.temple.internal;

public class Snack extends Food{
    public Snack(){
        System.out.println("no arg constructor of Snack");
    }

    public void eatSnack(){
        System.out.println("eatSnack running in Snack");


        Food food=new Food();
    }
}

package com.xworkz.temple.internal;

public class Biscuit extends Snack{
    public Biscuit(){
        System.out.println("no arg constructor of Biscuit");
    }

    public  void eatBiscuit(){
        System.out.println("eatBiscuit running in Biscuit");

        Snack snack=new Snack();
        Food food=new Snack();
    }
}

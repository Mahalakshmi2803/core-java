package com.xworkz.temple.internal;

public class Nature {

    public Nature(){
        System.out.println("no-args constructor of Nature");
    }

    public void green(){
        System.out.println("green running in Nature");
        Forest forest=new Forest();
        forest.animals();
        forest.trees();
    }
}

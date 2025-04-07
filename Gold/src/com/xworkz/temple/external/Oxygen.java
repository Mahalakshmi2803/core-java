package com.xworkz.temple.external;

import com.xworkz.temple.internal.Forest;

public class Oxygen {
    public Oxygen(){
        System.out.println("no-args constructor of Oxygen");
    }

    public void water(){
        System.out.println("water running in Oxygen");
        Forest forest=new Forest();
        forest.trees();
    }
}

package com.xworkz.temple.internal;

public class UnisexPerfumes {

    public  UnisexPerfumes(){
        System.out.println("no-args constructor of UnisexPerfumes ");
    }

    public void seller(){
        System.out.println("seller running in UnisexPerfumes");
        Perfume perfume=new Perfume();
        perfume.brand();
        perfume.cost();
    }
}

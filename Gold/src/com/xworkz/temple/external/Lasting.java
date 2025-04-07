package com.xworkz.temple.external;

import com.xworkz.temple.internal.Perfume;

public class Lasting {
    public Lasting(){
        System.out.println("no-args constructor of Lasting");
    }

    public void strong(){
        System.out.println("strong running Lasting");
        Perfume perfume=new Perfume();
        perfume.brand();
    }
}

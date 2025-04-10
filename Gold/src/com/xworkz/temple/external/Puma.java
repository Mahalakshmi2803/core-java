package com.xworkz.temple.external;

import com.xworkz.temple.internal.Shoe;

public class Puma extends Shoe {
    public Puma(){
        System.out.println("no-arg constructor of Puma");
    }

    public void wear(){
        Shoe shoe=new Puma();
    }

}

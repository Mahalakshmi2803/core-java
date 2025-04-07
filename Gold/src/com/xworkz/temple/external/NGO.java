package com.xworkz.temple.external;

import com.xworkz.temple.internal.Temple;

public class NGO {

    public NGO(){
        System.out.println("no-args constructor of NGO");
    }
    public void maintenance(){


        Temple temple = new Temple();
        temple.Prasadam();
    }
}
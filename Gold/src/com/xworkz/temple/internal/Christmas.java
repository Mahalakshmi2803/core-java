package com.xworkz.temple.internal;

public class Christmas {

    public Christmas(){
        System.out.println("no-args constructor of Christmas");
    }

    public void celebrations(){
        System.out.println("celebrations running in Christmas");
        Church church=new Church();
        church.cake();
        church.prayer();
    }
}

package com.xworkz.temple.internal;

public class Church {

    public Church(){
        System.out.println("No-args constructor of Church");
    }

    public void prayer(){
        System.out.println("prayer running in Church");

    }
    void cake(){
        System.out.println("cake running in Church");
        bible();
    }

    private void bible(){
        System.out.println("bible running in Church");
    }
}

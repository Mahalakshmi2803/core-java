package com.xworkz.temple.internal;

public class Waves {
    public Waves(){
        System.out.println("no-args constructor of Waves");
    }

    public void wind(){
        System.out.println("wind running in Waves");
        Beach beach=new Beach();
        beach.shell();
        beach.water();
    }
}

package com.xworkz.abstractProb.internal;

public class Players extends AbstractGame{

    public Players(){
        System.out.println("players const has no-args");
    }
    @Override
    public void cricket(){

        System.out.println("cricket running in Players");
    }
}

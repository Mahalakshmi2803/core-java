package com.xworkz.temple.internal;

public class Beach {

    public Beach(){
        System.out.println("no-args constructor of Beach");
    }

    public void water(){
        System.out.println("water running in Beach");
    }
    void shell(){
        System.out.println("shell running in Beach");
        sand();
    }

    private void sand(){
        System.out.println("sand running in Beach");
    }
}

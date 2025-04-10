package com.xworkz.temple.internal;

public class Lock extends Security {

    public Lock() {
        System.out.println("no-arg constructor of Lock");
    }

    public void lockDoor() {
        System.out.println("lookDoor running in Lock");

        Security security = new Security();
        Security security1=new Lock();
    }
}

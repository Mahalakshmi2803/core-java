package com.xworkz.temple.internal;

public class Controller {
    public Controller() {
        System.out.println("no-args constructor of Controller");
    }

    public void operate() {
        System.out.println("operate  running in Controller");
        Drone drone = new Drone();
        drone.fly();
    }
}


package com.xworkz.temple.external;

import com.xworkz.temple.internal.Drone;

public class DroneSensor {
    public DroneSensor() {
        System.out.println("no-args constructor of DroneSensor");
    }

    public void detect() {
        System.out.println("detect running in DroneSensor");
        Drone drone = new Drone();
        drone.fly();
    }
}

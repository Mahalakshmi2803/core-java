package com.xworkz.temple.external;

import com.xworkz.temple.internal.Controller;

public class DroneRunner {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.operate();

        DroneSensor sensor = new DroneSensor();
        sensor.detect();
    }
}


package com.project.interfaces.runner;

import com.project.interfaces.external.CarParts;
import com.project.interfaces.internal.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car=new CarParts();
        car.bonnet();
        car.breaks();
        car.clutch();
        car.gear();
        car.seats();
        car.steering();
        car.wiper();
        CarParts carParts=new CarParts();
        carParts.bonnet();
        carParts.breaks();
        carParts.clutch();
        carParts.gear();
        carParts.seats();
        carParts.steering();
        carParts.wiper();

    }
}

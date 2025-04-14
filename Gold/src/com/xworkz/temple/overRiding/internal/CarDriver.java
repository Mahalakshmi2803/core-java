package com.xworkz.temple.overRiding.internal;

public class CarDriver {
    public CarDriver() {
        System.out.println("CarDriver constructor");
    }
    public void show(Car car) {
        if (car != null) {
            car.drive();
            if (car instanceof SportsCar) {
                SportsCar sc = (SportsCar) car;
                sc.turboBoost();
            } else {
                System.out.println("Car is not a SportsCar");
            }
        } else {
            System.out.println("Car is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class DriverManager {
    public DriverManager() {
        System.out.println("DriverManager constructor");
    }
    public void show(Driver driver) {
        if (driver != null) {
            driver.drive();
            if (driver instanceof TaxiDriver) {
                TaxiDriver td = (TaxiDriver) driver;
                td.pickUpPassenger();
            } else {
                System.out.println("Driver is not a TaxiDriver");
            }
        } else {
            System.out.println("Driver is null");
        }
    }
}

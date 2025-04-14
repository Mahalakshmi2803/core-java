package com.xworkz.temple.overRiding.internal;

public
class TaxiDriver extends Driver {
    public TaxiDriver() {
        System.out.println("TaxiDriver constructor");
    }
    @Override
    public void drive() {
        System.out.println("TaxiDriver is driving a taxi");
    }
    public void pickUpPassenger() {
        System.out.println("TaxiDriver is picking up a passenger");
    }
}


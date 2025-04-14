package com.xworkz.temple.overRiding.internal;

public  class Chair extends Seat {
    public Chair() {
        System.out.println("No-arg Chair constructor is running");
    }

    @Override
    public void use() {
        System.out.println("Running overridden use method from Chair class");
    }

    public void maintain() {
        System.out.println("Running maintain method from Chair class");
    }
}



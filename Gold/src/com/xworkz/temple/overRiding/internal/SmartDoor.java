package com.xworkz.temple.overRiding.internal;

public class SmartDoor extends Door {
    public SmartDoor() {
        System.out.println("SmartDoor constructor");
    }
    @Override
    public void use() {
        System.out.println("Using SmartDoor");
    }
    public void autoLock() {
        System.out.println("Auto-locking SmartDoor");
    }
}



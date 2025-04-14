package com.xworkz.temple.overRiding.internal;

public class DoorUser {
    public DoorUser() {
        System.out.println("DoorUser constructor");
    }
    public void show(Door door) {
        if (door != null) {
            door.use();
            if (door instanceof SmartDoor) {
                SmartDoor sd = (SmartDoor) door;
                sd.autoLock();
            } else {
                System.out.println("Not a SmartDoor, cannot auto-lock");
            }
        } else {
            System.out.println("Door is null");
        }
    }
}

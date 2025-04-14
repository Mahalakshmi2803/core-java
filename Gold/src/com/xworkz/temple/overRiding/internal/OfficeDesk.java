package com.xworkz.temple.overRiding.internal;

public class OfficeDesk extends Desk {
    public OfficeDesk() {
        System.out.println("OfficeDesk constructor");
    }
    @Override
    public void use() {
        System.out.println("Using OfficeDesk");
    }
    public void lockDrawer() {
        System.out.println("Locking drawer of OfficeDesk");
    }
}



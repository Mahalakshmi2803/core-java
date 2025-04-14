package com.xworkz.temple.overRiding.internal;

public class EngineerManager {
    public EngineerManager() {
        System.out.println("EngineerManager constructor");
    }
    public void show(Engineer engineer) {
        if (engineer != null) {
            engineer.design();
            if (engineer instanceof SoftwareEngineer) {
                SoftwareEngineer se = (SoftwareEngineer) engineer;
                se.writeCode();
            } else {
                System.out.println("Engineer is not a SoftwareEngineer");
            }
        } else {
            System.out.println("Engineer is null");
        }
    }
}

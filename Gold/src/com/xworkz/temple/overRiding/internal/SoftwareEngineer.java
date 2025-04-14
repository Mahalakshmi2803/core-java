package com.xworkz.temple.overRiding.internal;

public class SoftwareEngineer extends Engineer {
    public SoftwareEngineer() {
        System.out.println("SoftwareEngineer constructor");
    }
    @Override
    public void design() {
        System.out.println("SoftwareEngineer is designing software");
    }
    public void writeCode() {
        System.out.println("SoftwareEngineer is writing code");
    }
}



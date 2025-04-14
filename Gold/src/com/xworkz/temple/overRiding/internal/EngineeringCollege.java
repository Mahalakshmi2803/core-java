package com.xworkz.temple.overRiding.internal;

public class EngineeringCollege extends College {
    public EngineeringCollege() {
        System.out.println("EngineeringCollege constructor");
    }
    @Override
    public void lecture() {
        System.out.println("Engineering lectures in progress");
    }
    public void labSession() {
        System.out.println("Lab session in EngineeringCollege");
    }
}



package com.xworkz.temple.overRiding.internal;

public class Surgeon extends Doctor {
    public Surgeon() {
        System.out.println("Surgeon constructor");
    }
    @Override
    public void diagnose() {
        System.out.println("Surgeon is diagnosing surgery");
    }
    public void performSurgery() {
        System.out.println("Surgeon is performing surgery");
    }
}



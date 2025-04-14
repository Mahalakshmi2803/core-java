package com.xworkz.temple.overRiding.internal;

public class Football extends Ball {
    public Football() {
        System.out.println("Football constructor");
    }
    @Override
    public void bounce() {
        System.out.println("Football is bouncing");
    }
    public void kick() {
        System.out.println("Kicking the Football");
    }
}


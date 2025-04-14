package com.xworkz.temple.overRiding.internal;

public class CurlyHair extends Hair {
    public CurlyHair() {
        System.out.println("CurlyHair constructor");
    }
    @Override
    public void grow() {
        System.out.println("CurlyHair is growing");
    }
    public void bounce() {
        System.out.println("CurlyHair is bouncing");
    }
}



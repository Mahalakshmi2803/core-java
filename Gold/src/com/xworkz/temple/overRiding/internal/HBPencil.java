package com.xworkz.temple.overRiding.internal;

public class HBPencil extends Pencil {
    public HBPencil() {
        System.out.println("HBPencil constructor");
    }
    @Override
    public void draw() {
        System.out.println("Drawing with HBPencil");
    }
    public void sharpen() {
        System.out.println("Sharpening HBPencil");
    }
}



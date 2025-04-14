package com.xworkz.temple.overRiding.internal;

public class ProteinConditioner extends Conditioner {
    public ProteinConditioner() {
        System.out.println("ProteinConditioner constructor");
    }
    @Override
    public void soften() {
        System.out.println("Softening with ProteinConditioner");
    }
    public void strengthen() {
        System.out.println("ProteinConditioner strengthens hair");
    }
}



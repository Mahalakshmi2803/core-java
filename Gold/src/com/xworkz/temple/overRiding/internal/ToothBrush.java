package com.xworkz.temple.overRiding.internal;

public class ToothBrush extends Brush {
    public ToothBrush() {
        System.out.println("ToothBrush constructor");
    }
    @Override
    public void brush() {
        System.out.println("Brushing with ToothBrush");
    }
    public void cleanTeeth() {
        System.out.println("Cleaning teeth with ToothBrush");
    }
}



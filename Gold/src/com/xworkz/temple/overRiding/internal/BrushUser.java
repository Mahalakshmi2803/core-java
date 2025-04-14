package com.xworkz.temple.overRiding.internal;

public class BrushUser {
    public BrushUser() {
        System.out.println("BrushUser constructor");
    }
    public void show(Brush brush) {
        if (brush != null) {
            brush.brush();
            if (brush instanceof ToothBrush) {
                ToothBrush tb = (ToothBrush) brush;
                tb.cleanTeeth();
            } else {
                System.out.println("Brush is not a ToothBrush");
            }
        } else {
            System.out.println("Brush is null");
        }
    }
}

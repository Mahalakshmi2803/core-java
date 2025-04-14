package com.xworkz.temple.overRiding.internal;

public class Workout {
    public void show(Mat mat) {
        if (mat != null) {
            mat.use();
            if (mat instanceof YogaMat) {
                ((YogaMat) mat).rollUp();
            } else {
                System.out.println("Not a YogaMat");
            }
        }
    }
}

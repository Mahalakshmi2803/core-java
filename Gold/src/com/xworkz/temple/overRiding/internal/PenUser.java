package com.xworkz.temple.overRiding.internal;

public class PenUser {
    public PenUser() {
        System.out.println("PenUser constructor");
    }
    public void show(Pen pen) {
        if (pen != null) {
            pen.draw();
            if (pen instanceof BallPen) {
                BallPen bp = (BallPen) pen;
                bp.inkCheck();
            } else {
                System.out.println("Pen is not a BallPen");
            }
        } else {
            System.out.println("Pen is null");
        }
    }
}

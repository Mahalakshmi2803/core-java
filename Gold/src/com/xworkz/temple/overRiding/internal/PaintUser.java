package com.xworkz.temple.overRiding.internal;

public class PaintUser {
    public PaintUser() {
        System.out.println("PaintUser constructor");
    }
    public void show(Paint paint) {
        if (paint != null) {
            paint.apply();
            if (paint instanceof SprayPaint) {
                SprayPaint sp = (SprayPaint) paint;
                sp.spray();
            } else {
                System.out.println("Paint is not SprayPaint");
            }
        } else {
            System.out.println("Paint is null");
        }
    }
}

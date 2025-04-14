package com.xworkz.temple.overRiding.internal;

public class BallPen extends Pen {
    public BallPen() {
        System.out.println("BallPen constructor");
    }
    @Override
    public void draw() {
        System.out.println("Drawing smoothly with BallPen");
    }
    public void inkCheck() {
        System.out.println("Checking ink level in BallPen");
    }
}


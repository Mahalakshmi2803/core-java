package com.xworkz.temple.overRiding.internal;

public class ColorUser {
    public ColorUser() {
        System.out.println("ColorUser constructor");
    }
    public void show(Color color) {
        if (color != null) {
            color.fill();
            if (color instanceof WaterColor) {
                WaterColor wc = (WaterColor) color;
                wc.spread();
            } else {
                System.out.println("Color is not WaterColor");
            }
        } else {
            System.out.println("Color is null");
        }
    }
}

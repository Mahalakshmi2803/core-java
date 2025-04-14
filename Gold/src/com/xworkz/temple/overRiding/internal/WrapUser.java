package com.xworkz.temple.overRiding.internal;

public class WrapUser {
    public WrapUser() {
        System.out.println("WrapUser constructor");
    }
    public void show(Wrap wrap) {
        if (wrap != null) {
            wrap.cover();
            if (wrap instanceof FoodWrap) {
                FoodWrap fw = (FoodWrap) wrap;
                fw.preserve();
            } else {
                System.out.println("Wrap is not FoodWrap");
            }
        } else {
            System.out.println("Wrap is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class CoverUser {
    public CoverUser() {
        System.out.println("CoverUser constructor");
    }
    public void show(Cover cover) {
        if (cover != null) {
            cover.protect();
            if (cover instanceof MobileCover) {
                MobileCover mc = (MobileCover) cover;
                mc.personalize();
            } else {
                System.out.println("Cover is not a MobileCover");
            }
        } else {
            System.out.println("Cover is null");
        }
    }
}

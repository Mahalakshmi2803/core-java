package com.xworkz.temple.overRiding.internal;

public class CapUser {
    public CapUser() {
        System.out.println("CapUser constructor");
    }
    public void show(Cap cap) {
        if (cap != null) {
            cap.wear();
            if (cap instanceof BaseballCap) {
                BaseballCap bc = (BaseballCap) cap;
                bc.shadeEyes();
            } else {
                System.out.println("Cap is not BaseballCap");
            }
        } else {
            System.out.println("Cap is null");
        }
    }
}

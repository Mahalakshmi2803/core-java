package com.xworkz.temple.overRiding.internal;

public class MouseUser {
    public MouseUser() {
        System.out.println("MouseUser constructor");
    }
    public void show(Mouse mouse) {
        if (mouse != null) {
            mouse.click();
            if (mouse instanceof WirelessMouse) {
                WirelessMouse wm = (WirelessMouse) mouse;
                wm.connect();
            } else {
                System.out.println("Mouse is not WirelessMouse");
            }
        } else {
            System.out.println("Mouse is null");
        }
    }
}

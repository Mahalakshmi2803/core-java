package com.xworkz.temple.overRiding.internal;

public class WindowUser extends Window {
    public WindowUser() {
        System.out.println("WindowUser constructor");
    }
    public void show(Window w) {
        if (w != null) {
            w.open();
            if (w instanceof SlidingWindow) {
                SlidingWindow sw = (SlidingWindow) w;
                sw.lock();
            } else {
                System.out.println("Not a SlidingWindow");
            }
        } else {
            System.out.println("Window is null");
        }
    }
}

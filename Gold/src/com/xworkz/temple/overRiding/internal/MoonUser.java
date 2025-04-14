package com.xworkz.temple.overRiding.internal;

public class MoonUser {
    public MoonUser() {
        System.out.println("MoonUser constructor");
    }
    public void show(Moon moon) {
        if (moon != null) {
            moon.glow();
            if (moon instanceof FullMoon) {
                FullMoon fm = (FullMoon) moon;
                fm.shineBrightly();
            } else {
                System.out.println("Moon is not a FullMoon");
            }
        } else {
            System.out.println("Moon is null");
        }
    }
}

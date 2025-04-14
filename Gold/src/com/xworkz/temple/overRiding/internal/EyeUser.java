package com.xworkz.temple.overRiding.internal;

public class EyeUser {
    public EyeUser() {
        System.out.println("EyeUser constructor");
    }

    public void show(Eye eye) {
        if (eye != null) {
            eye.see();
            if (eye instanceof HumanEye) {
                HumanEye humanEye = (HumanEye) eye;
                humanEye.blink();
            } else {
                System.out.println("Eye is not HumanEye");
            }
        } else {
            System.out.println("Eye is null");
        }
    }
}

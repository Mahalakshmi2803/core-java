package com.xworkz.temple.overRiding.internal;

public class HumanEye extends Eye {
    public HumanEye() {
        System.out.println("HumanEye constructor");
    }

    @Override
    public void see() {
        System.out.println("HumanEye is seeing clearly");
    }

    public void blink() {
        System.out.println("HumanEye is blinking");
    }
}




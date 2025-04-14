package com.xworkz.temple.overRiding.internal;

public class GamingKeyboard extends Keyboard {
    public GamingKeyboard() {
        System.out.println("GamingKeyboard constructor");
    }

    @Override
    public void type() {
        System.out.println("Typing on Gaming Keyboard");
    }

    public void lightUp() {
        System.out.println("Lighting up Gaming Keyboard");
    }
}



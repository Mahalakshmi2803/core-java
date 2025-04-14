package com.xworkz.temple.overRiding.internal;


public class KeyboardUser {
    public KeyboardUser() {
        System.out.println("KeyboardUser constructor");
    }

    public void show(Keyboard keyboard) {
        if (keyboard != null) {
            keyboard.type();
            if (keyboard instanceof GamingKeyboard) {
                GamingKeyboard gamingKeyboard = (GamingKeyboard) keyboard;
                gamingKeyboard.lightUp();
            } else {
                System.out.println("Keyboard is not GamingKeyboard");
            }
        } else {
            System.out.println("Keyboard is null");
        }
    }
}

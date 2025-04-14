package com.xworkz.temple.overRiding.internal;

public class SwitchUser {
    public SwitchUser() {
        System.out.println("SwitchUser constructor");
    }
    public void show(Switch sw) {
        if (sw != null) {
            sw.toggle();
            if (sw instanceof SmartSwitch) {
                SmartSwitch ss = (SmartSwitch) sw;
                ss.connectApp();
            } else {
                System.out.println("Switch is not SmartSwitch");
            }
        } else {
            System.out.println("Switch is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class WirelessMouse extends Mouse {
    public WirelessMouse() {
        System.out.println("WirelessMouse constructor");
    }
    @Override
    public void click() {
        System.out.println("Clicking WirelessMouse");
    }
    public void connect() {
        System.out.println("WirelessMouse connected via Bluetooth");
    }
}



package com.xworkz.temple.overRiding.internal;

public class SmartSwitch extends Switch {
    public SmartSwitch() {
        System.out.println("SmartSwitch constructor");
    }
    @Override
    public void toggle() {
        System.out.println("Toggling SmartSwitch");
    }
    public void connectApp() {
        System.out.println("SmartSwitch connected to app");
    }
}



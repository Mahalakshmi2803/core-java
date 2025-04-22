package com.project.interfaces.external;

import com.project.interfaces.internal.SmartPhone;

public class SmartPhoneDetails implements SmartPhone {
    @Override
    public void brand() {
        System.out.println("brand running in SmartPhoneDetails");
    }

    @Override
    public void cost() {
        System.out.println("cost running in SmartPhoneDetails");
    }

    @Override
    public void memory() {
        System.out.println("memory running in SmartPhoneDetails");
    }

    @Override
    public void os() {
        System.out.println("os running in SmartPhoneDetails");
    }

    @Override
    public void screen() {
        System.out.println("screen running in SmartPhoneDetails");
    }

    @Override
    public void sim() {
        System.out.println("sim running in SmartPhoneDetails");
    }

    @Override
    public void sound() {
        System.out.println("sound running in SmartPhoneDetails");
    }
}

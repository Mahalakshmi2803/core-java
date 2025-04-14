package com.xworkz.temple.overRiding.internal;

public class EarphonesUser {
    public EarphonesUser() {
        System.out.println("EarphonesUser constructor");
    }
    public void show(Earphones earphones) {
        if (earphones != null) {
            earphones.listen();
            if (earphones instanceof WirelessEarphones) {
                WirelessEarphones we = (WirelessEarphones) earphones;
                we.connect();
            } else {
                System.out.println("Earphones is not WirelessEarphones");
            }
        } else {
            System.out.println("Earphones is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class WirelessEarphones extends Earphones {
    public WirelessEarphones() {
        System.out.println("WirelessEarphones constructor");
    }
    @Override
    public void listen() {
        System.out.println("Listening through WirelessEarphones");
    }
    public void connect() {
        System.out.println("Connecting WirelessEarphones");
    }
}



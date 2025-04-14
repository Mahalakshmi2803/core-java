package com.xworkz.temple.overRiding.internal;

public class DigitalLock extends Lock {
    public DigitalLock() {
        System.out.println("DigitalLock constructor");
    }
    @Override
    public void secure() {
        System.out.println("DigitalLock is securing with code");
    }
    public void scanFingerprint() {
        System.out.println("DigitalLock is scanning fingerprint");
    }
}



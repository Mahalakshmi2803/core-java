package com.xworkz.temple.overRiding.internal;

public class LockUser {
    public LockUser() {
        System.out.println("LockUser constructor");
    }
    public void show(Lock lock) {
        if (lock != null) {
            lock.secure();
            if (lock instanceof DigitalLock) {
                DigitalLock d = (DigitalLock) lock;
                d.scanFingerprint();
            } else {
                System.out.println("Lock is not a DigitalLock");
            }
        }
    }
}

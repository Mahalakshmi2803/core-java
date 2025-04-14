package com.xworkz.temple.overRiding.internal;

public class ThreadUser {
    public ThreadUser() {
        System.out.println("ThreadUser constructor");
    }
    public void show(Threads thread) {
        if (thread != null) {
            thread.bind();
            if (thread instanceof CottonThread) {
                CottonThread ct = (CottonThread) thread;
                ct.stretch();
            } else {
                System.out.println("Thread is not CottonThread");
            }
        } else {
            System.out.println("Thread is null");
        }
    }
}

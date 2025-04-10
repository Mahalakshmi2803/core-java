package com.xworkz.temple.internal;

public class Thread extends Cotton {

    public Thread() {
        System.out.println("no-arg constructor of Thread");
    }

    public void weavingThread() {
        System.out.println("weavingThread running in thread");

        Cotton cotton = new Cotton();
        Material material = new Cotton();
    }
}

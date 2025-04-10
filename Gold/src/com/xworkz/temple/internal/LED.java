package com.xworkz.temple.internal;

public class LED extends Light {

    public LED() {
        System.out.println("no-arg constructor of LED");
    }

    public void glowLED() {
        System.out.println("glowLED running in LED");

        Light light = new Light();
        Light light1=new LED();
    }
}

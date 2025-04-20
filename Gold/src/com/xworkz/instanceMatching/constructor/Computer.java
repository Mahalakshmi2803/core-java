package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Computer {
    private String processor;
    private double ramSize;
    private boolean hasSSD;
    private int usbPorts;

    public Computer(String processor, double ramSize, boolean hasSSD, int usbPorts) {
        this.processor = processor;
        this.ramSize = ramSize;
        this.hasSSD = hasSSD;
        this.usbPorts = usbPorts;
    }

    @Override
    public String toString() {
        return "Computer{" + "processor='" + processor + '\'' + ", ramSize=" + ramSize +
                ", hasSSD=" + hasSSD + ", usbPorts=" + usbPorts + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Computer) {
            Computer other = (Computer) obj;
            if (Objects.equals(this.processor, other.processor) && this.ramSize == other.ramSize) {
                System.out.println("Computer is matching..");
                return true;
            }
        }
        return false;
    }
}


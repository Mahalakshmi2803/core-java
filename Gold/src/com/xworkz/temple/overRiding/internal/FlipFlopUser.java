package com.xworkz.temple.overRiding.internal;

public class FlipFlopUser {
    public FlipFlopUser() {
        System.out.println("FlipFlopUser constructor");
    }
    public void show(FlipFlop flipFlop) {
        if (flipFlop != null) {
            flipFlop.wear();
            if (flipFlop instanceof RubberFlipFlop) {
                RubberFlipFlop rf = (RubberFlipFlop) flipFlop;
                rf.stretch();
            } else {
                System.out.println("FlipFlop is not a RubberFlipFlop");
            }
        } else {
            System.out.println("FlipFlop is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class RubberFlipFlop extends FlipFlop {
    public RubberFlipFlop() {
        System.out.println("RubberFlipFlop constructor");
    }
    @Override
    public void wear() {
        System.out.println("Wearing RubberFlipFlop");
    }
    public void stretch() {
        System.out.println("Stretching RubberFlipFlop");
    }
}



package com.xworkz.temple.overRiding.internal;

public class FighterJet extends Jet {
    public FighterJet() {
        System.out.println("FighterJet constructor");
    }
    @Override
    public void fly() {
        System.out.println("FighterJet is flying at high speed");
    }
    public void attack() {
        System.out.println("FighterJet is attacking");
    }
}



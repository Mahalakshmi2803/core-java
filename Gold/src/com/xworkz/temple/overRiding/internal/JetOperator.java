package com.xworkz.temple.overRiding.internal;

public class JetOperator {
    public JetOperator() {
        System.out.println("JetOperator constructor");
    }
    public void show(Jet jet) {
        if (jet != null) {
            jet.fly();
            if (jet instanceof FighterJet) {
                FighterJet fj = (FighterJet) jet;
                fj.attack();
            } else {
                System.out.println("Jet is not a FighterJet");
            }
        } else {
            System.out.println("Jet is null");
        }
    }
}

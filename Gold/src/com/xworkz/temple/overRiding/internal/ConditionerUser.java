package com.xworkz.temple.overRiding.internal;

public class ConditionerUser {
    public ConditionerUser() {
        System.out.println("ConditionerUser constructor");
    }
    public void show(Conditioner conditioner) {
        if (conditioner != null) {
            conditioner.soften();
            if (conditioner instanceof ProteinConditioner) {
                ProteinConditioner pc = (ProteinConditioner) conditioner;
                pc.strengthen();
            } else {
                System.out.println("Conditioner is not ProteinConditioner");
            }
        } else {
            System.out.println("Conditioner is null");
        }
    }
}

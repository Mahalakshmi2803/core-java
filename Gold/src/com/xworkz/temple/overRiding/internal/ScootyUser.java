package com.xworkz.temple.overRiding.internal;

public class ScootyUser extends Scooty {
    public ScootyUser() {
        System.out.println("ScootyUser constructor");
    }
    public void show(Scooty s) {
        if (s != null) {
            s.ride();
            if (s instanceof ElectricScooty) {
                ElectricScooty es = (ElectricScooty) s;
                es.charge();
            } else {
                System.out.println("Not an ElectricScooty");
            }
        } else {
            System.out.println("Scooty is null");
        }
    }
}

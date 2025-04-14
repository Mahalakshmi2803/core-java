package com.xworkz.temple.overRiding.internal;

public class ChargerUser {
    public ChargerUser() {
        System.out.println("ChargerUser constructor");
    }
    public void show(Charger charger) {
        if (charger != null) {
            charger.charge();
            if (charger instanceof FastCharger) {
                FastCharger fc = (FastCharger) charger;
                fc.quickCharge();
            } else {
                System.out.println("Charger is not a FastCharger");
            }
        } else {
            System.out.println("Charger is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class MugUser {
    public MugUser() {
        System.out.println("MugUser constructor");
    }
    public void show(Mug mug) {
        if (mug != null) {
            mug.sip();
            if (mug instanceof CeramicMug) {
                CeramicMug cm = (CeramicMug) mug;
                cm.heatResistant();
            } else {
                System.out.println("Mug is not CeramicMug");
            }
        } else {
            System.out.println("Mug is null");
        }
    }
}

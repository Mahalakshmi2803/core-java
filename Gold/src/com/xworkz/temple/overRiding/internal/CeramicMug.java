package com.xworkz.temple.overRiding.internal;

public class CeramicMug extends Mug {
    public CeramicMug() {
        System.out.println("CeramicMug constructor");
    }
    @Override
    public void sip() {
        System.out.println("Sipping from CeramicMug");
    }
    public void heatResistant() {
        System.out.println("CeramicMug is heat resistant");
    }
}



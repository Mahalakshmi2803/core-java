package com.xworkz.temple.overRiding.internal;

public class AlmondMilk extends Milk {
    public AlmondMilk() {
        System.out.println("AlmondMilk constructor");
    }

    @Override
    public void pour() {
        System.out.println("Pouring Almond Milk");
    }

    public void addSweetener() {
        System.out.println("Adding sweetener to Almond Milk");
    }
}




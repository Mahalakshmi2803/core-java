package com.project.interfaces.external;

import com.project.interfaces.internal.Bed;

public class BedSpread implements Bed {

    @Override
    public void cost() {
        System.out.println("cost running in BedSpread");
    }

    @Override
    public void brand() {
        System.out.println("brand running in BedSpread");
    }

    @Override
    public void length() {
        System.out.println("length running in BedSpread");
    }

    @Override
    public void size() {
        System.out.println("size running in BedSpread");
    }

    @Override
    public void width() {
        System.out.println("width running in BedSpread");
    }
}

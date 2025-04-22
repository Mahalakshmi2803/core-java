package com.project.interfaces.external;

import com.project.interfaces.internal.Bottle;

public class BottleDetails implements Bottle {

    @Override
    public void brand() {
        System.out.println("brand running in BottleDetails");
    }

    @Override
    public void capacity() {
        System.out.println("capacity running in BottleDetails");
    }

    @Override
    public void cost() {
        System.out.println("cost running in BottleDetails");
    }
}

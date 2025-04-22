package com.project.interfaces.external;

import com.project.interfaces.internal.Car;

public class CarParts implements Car {
    @Override
    public void bonnet() {
        System.out.println("bonnet running in CarParts");
    }

    @Override
    public void breaks() {
        System.out.println("breaks running in CarParts");
    }

    @Override
    public void clutch() {
        System.out.println("clutch running in CarParts");
    }

    @Override
    public void gear() {
        System.out.println("gear running in CarParts");
    }

    @Override
    public void seats() {
        System.out.println("seats running in CarParts");
    }

    @Override
    public void steering() {
        System.out.println("steering running in CarParts");
    }

    @Override
    public void wiper() {
        System.out.println("wiper running in CarParts");
    }
}

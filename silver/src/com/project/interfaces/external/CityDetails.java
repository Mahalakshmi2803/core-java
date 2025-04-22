package com.project.interfaces.external;

import com.project.interfaces.internal.City;

public class CityDetails implements City {
    @Override
    public void buildings() {
        System.out.println("buildings running CityDetails");
    }

    @Override
    public void malls() {
        System.out.println("malls running CityDetails");
    }

    @Override
    public void metro() {
        System.out.println("metro running CityDetails");
    }

    @Override
    public void roads() {
        System.out.println("road running CityDetails");
    }

    @Override
    public void traffic() {
        System.out.println("traffic running CityDetails");
    }
}

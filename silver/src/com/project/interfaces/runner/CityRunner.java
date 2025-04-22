package com.project.interfaces.runner;

import com.project.interfaces.external.CityDetails;
import com.project.interfaces.internal.City;

public class CityRunner {
    public static void main(String[] args) {
        City city=new CityDetails();
        city.buildings();
        city.malls();
        city.metro();
        city.roads();
        city.traffic();
        CityDetails cityDetails=new CityDetails();
        cityDetails.buildings();
        cityDetails.malls();
        cityDetails.metro();
        cityDetails.traffic();
        cityDetails.roads();
    }
}

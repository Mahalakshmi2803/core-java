package com.project.interfaces.runner;

import com.project.interfaces.external.AirlineFacility;
import com.project.interfaces.internal.Airport;

public class AirportRunner {
    public static void main(String[] args) {
        Airport airport=new AirlineFacility();
        airport.airlinesName();
        airport.cost();
        airport.destination();
        airport.flight();
        airport.source();
        airport.ticket();
        airport.timeDuration();
        AirlineFacility airlineFacility=new AirlineFacility();
        airlineFacility.airlinesName();
        airlineFacility.cost();
        airlineFacility.destination();
        airlineFacility.flight();
        airlineFacility.source();
        airlineFacility.ticket();
        airlineFacility.timeDuration();
    }
}

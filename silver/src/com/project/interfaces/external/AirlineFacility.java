package com.project.interfaces.external;

import com.project.interfaces.internal.Airport;

public class AirlineFacility implements Airport {
    @Override
    public void cost() {
        System.out.println("cost running in AirlineFacility");
    }

    @Override
    public void airlinesName() {
        System.out.println("airlinesName running in AirlineFacility");
    }

    @Override
    public void destination() {
        System.out.println("destination running in AirlineFacility");
    }

    @Override
    public void flight() {
        System.out.println("flight running in AirlineFacility");
    }

    @Override
    public void source() {
        System.out.println("source running in AirlineFacility");
    }

    @Override
    public void ticket() {
        System.out.println("ticket running in AirlineFacility");
    }

    @Override
    public void timeDuration() {
        System.out.println("timeDuration running in AirlineFacility");
    }
}

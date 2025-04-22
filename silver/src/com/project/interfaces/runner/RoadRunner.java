package com.project.interfaces.runner;

import com.project.interfaces.external.RoadDetails;
import com.project.interfaces.internal.Road;

public class RoadRunner {
    public static void main(String[] args) {
        Road road=new RoadDetails();
        road.deviations();
        road.divider();
        road.flyover();
        road.humps();
        road.length();
        road.type();
        road.width();
        road.shoulders();
        road.zebraCross();
        RoadDetails roadDetails=new RoadDetails();
        roadDetails.deviations();
        roadDetails.divider();
        roadDetails.flyover();
        roadDetails.humps();
        roadDetails.length();
        roadDetails.type();
        roadDetails.width();
        roadDetails.shoulders();
        roadDetails.zebraCross();
    }
}

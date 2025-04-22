package com.project.interfaces.external;

import com.project.interfaces.internal.Road;

public class RoadDetails implements Road {

    @Override
    public void length() {
        System.out.println("length running in RoadDetails");
    }

    @Override
    public void width() {
        System.out.println("width running in RoadDetails");
    }

    @Override
    public void deviations() {
        System.out.println("deviations running in RoadDetails");
    }

    @Override
    public void divider() {
        System.out.println("divider running in RoadDetails");
    }

    @Override
    public void flyover() {
        System.out.println("flyover running in RoadDetails");
    }

    @Override
    public void humps() {
        System.out.println("humps running in RoadDetails");
    }

    @Override
    public void shoulders() {
        System.out.println("shoulders running in RoadDetails");
    }

    @Override
    public void type() {
        System.out.println("type running in RoadDetails");
    }

    @Override
    public void zebraCross() {
        System.out.println("zebraCross running in RoadDetails");
    }
}

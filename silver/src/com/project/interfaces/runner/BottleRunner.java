package com.project.interfaces.runner;

import com.project.interfaces.external.BottleDetails;
import com.project.interfaces.internal.Bottle;

public class BottleRunner {

    public static void main(String[] args) {
        Bottle bottle=new BottleDetails();
        bottle.brand();
        bottle.cost();
        bottle.capacity();
        BottleDetails bottleDetails=new BottleDetails();
        bottleDetails.brand();
        bottleDetails.cost();
        bottleDetails.capacity();
    }
}

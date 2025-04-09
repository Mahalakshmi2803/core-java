package com.xworkz.temple.external;

import com.xworkz.temple.internal.Jet;

public class Passenger {
    public Passenger() {
        System.out.println("no-args constructor of Passenger");
    }

    public void viewJet() {
        System.out.println("viewJet running in Passenger");
        Jet jet = new Jet();

        System.out.println("Jet Name: " + jet.getName());
        System.out.println("Jet Speed: " + jet.getSpeed());
        System.out.println("Is Military Jet: " + jet.getMilitary());
        System.out.println("Jet Range: " + jet.getRange());
        System.out.println("Jet Seats: " + jet.getSeats());
    }
}


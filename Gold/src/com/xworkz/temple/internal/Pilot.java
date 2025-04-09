package com.xworkz.temple.internal;

public class Pilot {
    public Pilot() {
        System.out.println("no-args constructor of Pilot");
    }

    public void showJetDetails() {
        System.out.println("showJetDetails running in Pilot");
        Jet jet = new Jet();

        System.out.println("Jet Name: " + jet.getName());
        System.out.println("Jet Speed: " + jet.getSpeed());
        System.out.println("Is Military Jet: " + jet.getMilitary());
        System.out.println("Jet Range: " + jet.getRange());
        System.out.println("Jet Seats: " + jet.getSeats());

        jet.setName("Eagle");
        jet.setSpeed(1200);
        jet.setMilitary(false);
        jet.setRange(3000.75);
        jet.setSeats( 4);

        System.out.println("Updated Jet Name: " + jet.getName());
        System.out.println("Updated Jet Speed: " + jet.getSpeed());
        System.out.println("Updated Is Military Jet: " + jet.getMilitary());
        System.out.println("Updated Jet Range: " + jet.getRange());
        System.out.println("Updated Jet Seats: " + jet.getSeats());
    }
}


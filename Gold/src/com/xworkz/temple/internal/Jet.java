package com.xworkz.temple.internal;

public class Jet {
    private String name = "Falcon";
    private int speed = 900;
    private boolean military = true;
    private double range = 2500.5;
    private int seats = 2;

    public Jet() {
        System.out.println("no-args constructor of Jet");
    }

    void setName(String name) {
        this.name = name;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setMilitary(boolean military) {
        this.military = military;
    }

    void setRange(double range) {
        this.range = range;
    }

    void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getMilitary() {
        return military;
    }

    public double getRange() {
        return range;
    }

    public int getSeats() {
        return seats;
    }
}


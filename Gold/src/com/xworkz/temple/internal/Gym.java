package com.xworkz.temple.internal;

public class Gym {
    private String gymName = "FitZone";
    private int numberOfMachines = 25;
    private boolean hasTrainer = true;
    private double monthlyFee = 1500.50;
    private int openingHour = 6;

    public Gym() {
        System.out.println("no-args constructor of Gym");
    }

    void setGymName(String gymName) {
        this.gymName = gymName;
    }

    void setNumberOfMachines(int numberOfMachines) {
        this.numberOfMachines = numberOfMachines;
    }

    void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    void setOpeningHour(int openingHour) {
        this.openingHour = openingHour;
    }

    public String getGymName() {
        return gymName;
    }

    public int getNumberOfMachines() {
        return numberOfMachines;
    }

    public boolean getHasTrainer() {
        return hasTrainer;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public int getOpeningHour() {
        return openingHour;
    }
}


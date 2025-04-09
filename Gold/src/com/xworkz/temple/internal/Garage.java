package com.xworkz.temple.internal;

public class Garage {
    private String name = "AutoCare";
    private int totalVehicles = 20;
    private boolean openNow = true;
    private double serviceCharge = 1500.75;
    private int workers = 5;

    public Garage() {
        System.out.println("no-args constructor of Garage");
    }

    void setName(String name) {
        this.name = name;
    }

    void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    void setOpenNow(boolean openNow) {
        this.openNow = openNow;
    }

    void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    void setWorkers(int workers) {
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public boolean getOpenNow() {
        return openNow;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public int getWorkers() {
        return workers;
    }
}


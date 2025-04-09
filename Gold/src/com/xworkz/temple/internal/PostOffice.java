package com.xworkz.temple.internal;

public class PostOffice {
    private boolean isOpen = true;
    private double area = 250.5;
    private int workers = 15;
    private String zone = "A-Zone";
    private String city = "Bangalore";

    public PostOffice() {
        System.out.println("no-args constructor of PostOffice");
    }

    void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    void setArea(double area) {
        this.area = area;
    }

    void setWorkers(int workers) {
        this.workers = workers;
    }

    void setZone(String zone) {
        this.zone = zone;
    }

    void setCity(String city) {
        this.city = city;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public double getArea() {
        return area;
    }

    public int getWorkers() {
        return workers;
    }

    public String getZone() {
        return zone;
    }

    public String getCity() {
        return city;
    }
}


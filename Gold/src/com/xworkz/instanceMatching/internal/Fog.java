package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Fog {
    private boolean isThick;
    private int visibility;
    private String location;
    private double temperature;

    public Fog() {
        System.out.println("no argument constructor of Fog...");
    }

    public void setIsThick(boolean isThick) {
        this.isThick = isThick;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fog{" + "isThick=" + isThick + ", visibility=" + visibility + ", location=" + location + ", temperature=" + temperature + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fog) {
            Fog other = (Fog) obj;
            if (Objects.equals(this.location, other.location) &&
                    this.visibility == other.visibility) {
                System.out.println("Fog is matching..");
                return true;
            }
        }
        return false;
    }
}


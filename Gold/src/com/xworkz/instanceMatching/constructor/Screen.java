package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Screen {
    private double sizeInInches;
    private boolean isTouchscreen;
    private String resolution;
    private String type;

    public Screen(double sizeInInches, boolean isTouchscreen, String resolution, String type) {
        this.sizeInInches = sizeInInches;
        this.isTouchscreen = isTouchscreen;
        this.resolution = resolution;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Screen{" + "sizeInInches=" + sizeInInches + ", isTouchscreen=" + isTouchscreen + ", resolution='" + resolution + "', type='" + type + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Screen) {
            Screen other = (Screen) obj;
            if (Objects.equals(this.sizeInInches, other.sizeInInches) && this.isTouchscreen == other.isTouchscreen) {
                System.out.println("Screen is matching..");
                return true;
            }
        }
        return false;
    }
}


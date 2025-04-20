package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class TV {
    private String type;
    private double screenSize;
    private boolean isSmart;
    private int hdmiPorts;

    public TV(String type, double screenSize, boolean isSmart, int hdmiPorts) {
        this.type = type;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
        this.hdmiPorts = hdmiPorts;
    }

    @Override
    public String toString() {
        return "TV{" + "type='" + type + '\'' + ", screenSize=" + screenSize + ", isSmart=" + isSmart + ", hdmiPorts=" + hdmiPorts + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TV) {
            TV other = (TV) obj;
            if (Objects.equals(this.type, other.type) && this.screenSize == other.screenSize) {
                System.out.println("TV is matching..");
                return true;
            }
        }
        return false;
    }
}


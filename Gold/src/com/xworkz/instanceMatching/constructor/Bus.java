package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Bus {
    private int capacity;
    private double length;
    private String company;
    private boolean isAC;

    public Bus(int capacity, double length, String company, boolean isAC) {
        this.capacity = capacity;
        this.length = length;
        this.company = company;
        this.isAC = isAC;
    }

    @Override
    public String toString() {
        return "Bus{" + "capacity=" + capacity + ", length=" + length + ", company='" + company + "', isAC=" + isAC + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bus) {
            Bus other = (Bus) obj;
            if (this.capacity == other.capacity && Objects.equals(this.company, other.company)) {
                System.out.println("Bus is matching..");
                return true;
            }
        }
        return false;
    }
}


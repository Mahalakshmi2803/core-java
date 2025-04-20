package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Boat {
    private double length;
    private String type;
    private boolean hasEngine;
    private int capacity;

    public Boat(double length, String type, boolean hasEngine, int capacity) {
        this.length = length;
        this.type = type;
        this.hasEngine = hasEngine;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Boat{" + "length=" + length + ", type='" + type + '\'' + ", hasEngine=" + hasEngine + ", capacity=" + capacity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Boat) {
            Boat other = (Boat) obj;
            if (Objects.equals(this.type, other.type) && this.capacity == other.capacity) {
                System.out.println("Boat is matching..");
                return true;
            }
        }
        return false;
    }
}


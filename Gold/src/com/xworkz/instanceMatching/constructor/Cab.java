package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Cab {
    private boolean isBooked;
    private String driver;
    private double fare;
    private int rating;

    public Cab(boolean isBooked, String driver, double fare, int rating) {
        this.isBooked = isBooked;
        this.driver = driver;
        this.fare = fare;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Cab{" + "isBooked=" + isBooked + ", driver='" + driver + "', fare=" + fare + ", rating=" + rating + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cab) {
            Cab other = (Cab) obj;
            if (Objects.equals(this.driver, other.driver) && Objects.equals(this.fare, other.fare)) {
                System.out.println("Cab is matching..");
                return true;
            }
        }
        return false;
    }
}

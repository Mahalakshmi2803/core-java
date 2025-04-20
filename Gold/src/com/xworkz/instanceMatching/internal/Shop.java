package com.xworkz.instanceMatching.internal;

import java.util.Objects;

public class Shop {
    private String name;
    private boolean openOnSunday;
    private double rent;
    private int employees;

    public Shop() {
        System.out.println("no argument constructor of Shop...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpenOnSunday(boolean openOnSunday) {
        this.openOnSunday = openOnSunday;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", openOnSunday=" + openOnSunday +
                ", rent=" + rent +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shop) {
            Shop other = (Shop) obj;
            if (Objects.equals(this.name, other.name) &&
                    this.employees == other.employees) {
                System.out.println("Shop is matching..");
                return true;
            }
        }
        return false;
    }
}


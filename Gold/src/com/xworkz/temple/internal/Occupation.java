package com.xworkz.temple.internal;

public class Occupation {
    private String title = "Engineer";
    private double salary = 75000.50;
    private int workHours = 8;
    private int experience = 5;
    private boolean isRemote = true;

    public Occupation() {
        System.out.println("no-args constructor of Occupation");
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    void setIsRemote(boolean isRemote) {
        this.isRemote = isRemote;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getExperience() {
        return experience;
    }

    public boolean getIsRemote() {
        return isRemote;
    }
}


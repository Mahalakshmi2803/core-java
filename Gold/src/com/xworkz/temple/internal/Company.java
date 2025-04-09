package com.xworkz.temple.internal;

public class Company {
    public Company() {
        System.out.println("no-args constructor of Company");
    }

    public void showOccupationDetails() {
        System.out.println("showOccupationDetails running in Company");
        Occupation occupation = new Occupation();

        System.out.println("Occupation Title: " + occupation.getTitle());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Work Hours: " + occupation.getWorkHours());
        System.out.println("Experience: " + occupation.getExperience());
        System.out.println("Is Remote: " + occupation.getIsRemote());

        occupation.setTitle("Designer");
        occupation.setSalary(65000.75);
        occupation.setWorkHours(7);
        occupation.setExperience(3);
        occupation.setIsRemote(false);

        System.out.println("Updated Occupation Title: " + occupation.getTitle());
        System.out.println("Updated Salary: " + occupation.getSalary());
        System.out.println("Updated Work Hours: " + occupation.getWorkHours());
        System.out.println("Updated Experience: " + occupation.getExperience());
        System.out.println("Updated Is Remote: " + occupation.getIsRemote());
    }
}


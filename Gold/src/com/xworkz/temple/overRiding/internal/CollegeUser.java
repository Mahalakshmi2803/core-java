package com.xworkz.temple.overRiding.internal;

public class CollegeUser extends College {
    public CollegeUser() {
        System.out.println("CollegeUser constructor");
    }
    public void show(College c) {
        if (c != null) {
            c.lecture();
            if (c instanceof EngineeringCollege) {
                EngineeringCollege ec = (EngineeringCollege) c;
                ec.labSession();
            } else {
                System.out.println("Not an EngineeringCollege");
            }
        } else {
            System.out.println("College is null");
        }
    }
}

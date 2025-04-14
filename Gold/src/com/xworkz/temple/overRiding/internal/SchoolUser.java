package com.xworkz.temple.overRiding.internal;

public class SchoolUser extends School {
    public SchoolUser() {
        System.out.println("SchoolUser constructor");
    }
    public void show(School s) {
        if (s != null) {
            s.educate();
            if (s instanceof HighSchool) {
                HighSchool hs = (HighSchool) s;
                hs.sportsDay();
            } else {
                System.out.println("Not a HighSchool");
            }
        } else {
            System.out.println("School is null");
        }
    }
}

package com.xworkz.temple.overRiding.internal;

public class HighSchool extends School {
    public HighSchool() {
        System.out.println("HighSchool constructor");
    }
    @Override
    public void educate() {
        System.out.println("Educating in HighSchool");
    }
    public void sportsDay() {
        System.out.println("Organizing Sports Day in HighSchool");
    }
}


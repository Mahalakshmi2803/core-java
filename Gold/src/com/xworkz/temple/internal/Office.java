package com.xworkz.temple.internal;

public class Office {
    public Office() {
        System.out.println("no-args constructor of Office");
    }

    public void showBadgeDetails() {
        System.out.println("showBadgeDetails running in Office");
        Badge badge = new Badge();

        System.out.println("Badge Name: " + badge.getName());
        System.out.println("Badge Color: " + badge.getColor());
        System.out.println("Badge Shape: " + badge.getShape());
        System.out.println("Badge ID Number: " + badge.getIdNumber());
        System.out.println("Badge Holder: " + badge.getHolder());

        badge.setName("Visitor Badge");
        badge.setColor("Red");
        badge.setShape("Oval");
        badge.setIdNumber(2002);
        badge.setHolder("Cloth");

        System.out.println("Updated Badge Name: " + badge.getName());
        System.out.println("Updated Badge Color: " + badge.getColor());
        System.out.println("Updated Badge Shape: " + badge.getShape());
        System.out.println("Updated Badge ID Number: " + badge.getIdNumber());
        System.out.println("Updated Badge Holder: " + badge.getHolder());
    }
}


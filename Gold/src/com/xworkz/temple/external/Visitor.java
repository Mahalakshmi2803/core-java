package com.xworkz.temple.external;

import com.xworkz.temple.internal.Badge;

public class Visitor {
    public Visitor() {
        System.out.println("no-args constructor of Visitor");
    }

    public void checkBadge() {
        System.out.println("checkBadge running in Visitor");
        Badge badge = new Badge();

        System.out.println("Badge Name: " + badge.getName());
        System.out.println("Badge Color: " + badge.getColor());
        System.out.println("Badge Shape: " + badge.getShape());
        System.out.println("Badge ID Number: " + badge.getIdNumber());
        System.out.println("Badge Holder: " + badge.getHolder());
    }
}


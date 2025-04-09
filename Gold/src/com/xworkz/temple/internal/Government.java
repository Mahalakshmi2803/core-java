package com.xworkz.temple.internal;

public class Government {
    public Government() {
        System.out.println("no-args constructor of Government");
    }

    public void showPostOfficeDetails() {
        System.out.println("showPostOfficeDetails running in Government");
        PostOffice postOffice = new PostOffice();

        System.out.println("Is PostOffice Open: " + postOffice.getIsOpen());
        System.out.println("PostOffice Area: " + postOffice.getArea());
        System.out.println("PostOffice Workers: " + postOffice.getWorkers());
        System.out.println("PostOffice Zone: " + postOffice.getZone());
        System.out.println("PostOffice City: " + postOffice.getCity());

        postOffice.setIsOpen(false);
        postOffice.setArea(300.75);
        postOffice.setWorkers(20);
        postOffice.setZone("B-Zone");
        postOffice.setCity("Mysore");

        System.out.println("Updated Is PostOffice Open: " + postOffice.getIsOpen());
        System.out.println("Updated PostOffice Area: " + postOffice.getArea());
        System.out.println("Updated PostOffice Workers: " + postOffice.getWorkers());
        System.out.println("Updated PostOffice Zone: " + postOffice.getZone());
        System.out.println("Updated PostOffice City: " + postOffice.getCity());
    }
}


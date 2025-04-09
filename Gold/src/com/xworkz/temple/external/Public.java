package com.xworkz.temple.external;

import com.xworkz.temple.internal.PostOffice;

public class Public {
    public Public() {
        System.out.println("no-args constructor of Public");
    }

    public void checkPostOffice() {
        System.out.println("checkPostOffice running in Public");
        PostOffice postOffice = new PostOffice();

        System.out.println("Is PostOffice Open: " + postOffice.getIsOpen());
        System.out.println("PostOffice Area: " + postOffice.getArea());
        System.out.println("PostOffice Workers: " + postOffice.getWorkers());
        System.out.println("PostOffice Zone: " + postOffice.getZone());
        System.out.println("PostOffice City: " + postOffice.getCity());
    }
}


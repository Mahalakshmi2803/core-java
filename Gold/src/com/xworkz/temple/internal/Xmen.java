package com.xworkz.temple.internal;

public class Xmen {
    public Xmen() {
        System.out.println("no-args constructor of Xmen");
    }

    public void showMutantDetails() {
        System.out.println("showMutantDetails running in Xmen");
        Mutant mutant = new Mutant();

        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Mutant Age: " + mutant.getAge());
        System.out.println("Is Strong: " + mutant.getStrong());
        System.out.println("Power Level: " + mutant.getPowerLevel());
        System.out.println("Number of Claws: " + mutant.getClaws());

        mutant.setName("Magneto");
        mutant.setAge(60);
        mutant.setStrong(false);
        mutant.setPowerLevel(92.3);
        mutant.setClaws( 0);

        System.out.println("Updated Mutant Name: " + mutant.getName());
        System.out.println("Updated Mutant Age: " + mutant.getAge());
        System.out.println("Updated Is Strong: " + mutant.getStrong());
        System.out.println("Updated Power Level: " + mutant.getPowerLevel());
        System.out.println("Updated Number of Claws: " + mutant.getClaws());
    }
}


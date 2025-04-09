package com.xworkz.temple.external;

import com.xworkz.temple.internal.Mutant;

public class Fan {
    public Fan() {
        System.out.println("no-args constructor of Fan");
    }

    public void watchMutant() {
        System.out.println("watchMutant running in Fan");
        Mutant mutant = new Mutant();

        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Mutant Age: " + mutant.getAge());
        System.out.println("Is Strong: " + mutant.getStrong());
        System.out.println("Power Level: " + mutant.getPowerLevel());
        System.out.println("Number of Claws: " + mutant.getClaws());
    }
}


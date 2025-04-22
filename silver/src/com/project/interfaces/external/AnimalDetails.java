package com.project.interfaces.external;

import com.project.interfaces.internal.Animal;

public class AnimalDetails implements Animal {
    @Override
    public void name() {
        System.out.println("name running in AnimalDetails");
    }

    @Override
    public void size() {
        System.out.println("size running in AnimalDetails");
    }

    @Override
    public void color() {
        System.out.println("color running in AnimalDetails");
    }

    @Override
    public void clawsPresence() {
        System.out.println("clawsPresence running in AnimalDetails");
    }

    @Override
    public void domestic() {
        System.out.println("domestic running in AnimalDetails");
    }

    @Override
    public void lifeSpan() {
        System.out.println("lifeSpan running in AnimalDetails");
    }

    @Override
    public void noOfLegs() {
        System.out.println("noOfLegs running in AnimalDetails");
    }

    @Override
    public void species() {
        System.out.println("species running in AnimalDetails");
    }

    @Override
    public void wild() {
        System.out.println("wild running in AnimalDetails");
    }
}


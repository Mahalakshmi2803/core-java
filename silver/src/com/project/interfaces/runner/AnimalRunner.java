package com.project.interfaces.runner;

import com.project.interfaces.external.AnimalDetails;
import com.project.interfaces.internal.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new AnimalDetails();
        animal.clawsPresence();
        animal.color();
        animal.domestic();
        animal.name();
        animal.lifeSpan();
        animal.size();
        animal.species();
        animal.noOfLegs();
        animal.wild();
        AnimalDetails animalDetails=new AnimalDetails();
        animalDetails.clawsPresence();
        animalDetails.color();
        animalDetails.domestic();
        animalDetails.name();
        animalDetails.lifeSpan();
        animalDetails.size();
        animalDetails.species();
        animalDetails.noOfLegs();
        animalDetails.wild();
    }
}

package com.xworkz.sunday.runner;

import com.xworkz.sunday.internal.Animal;
import com.xworkz.sunday.internal.Dog;
import com.xworkz.sunday.internal.Lion;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal animal=new Lion();
        animal.makeSound();
    }
}

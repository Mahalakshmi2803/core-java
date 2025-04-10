package com.xworkz.temple.internal;

public class Person extends Human {

    public Person() {
        System.out.println("no arg constructor of Person");
    }

    public void doWork() {
        System.out.println("doWork running in Person");

        Human human = new Human();
    }
}

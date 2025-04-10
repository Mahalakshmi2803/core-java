package com.xworkz.temple.internal;

public class Actor extends Person {

    public Actor() {
        System.out.println("no arg constructor of Actor");
    }

    public void act() {
        System.out.println("act running in Actor");

        Person person = new Person();
        Human human = new Person();


    }
}

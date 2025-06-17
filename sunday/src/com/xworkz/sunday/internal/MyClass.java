package com.xworkz.sunday.internal;

class MyClass implements A, B {
    // Must override to resolve ambiguity
    public void display() {
        // Optionally call one of the super methods
        B.super.display();  // or B.super.display();
    }
}



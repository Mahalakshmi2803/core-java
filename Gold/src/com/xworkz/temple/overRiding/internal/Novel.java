package com.xworkz.temple.overRiding.internal;

public class Novel extends Book {
    public Novel() {
        System.out.println("Novel constructor");
    }
    @Override
    public void open() {
        System.out.println("Opening Novel for reading");
    }
    public void readChapter() {
        System.out.println("Reading a chapter in Novel");
    }
}



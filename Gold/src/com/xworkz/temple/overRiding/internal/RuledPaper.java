package com.xworkz.temple.overRiding.internal;

public class RuledPaper extends Paper {
    public RuledPaper() {
        System.out.println("RuledPaper constructor");
    }
    @Override
    public void scribble() {
        System.out.println("Writing neatly on RuledPaper");
    }
    public void erase() {
        System.out.println("Erasing notes from RuledPaper");
    }
}



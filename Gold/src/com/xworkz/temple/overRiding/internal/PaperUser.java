package com.xworkz.temple.overRiding.internal;

public class PaperUser {
    public PaperUser() {
        System.out.println("PaperUser constructor");
    }
    public void show(Paper paper) {
        if (paper != null) {
            paper.scribble();
            if (paper instanceof RuledPaper) {
                RuledPaper rp = (RuledPaper) paper;
                rp.erase();
            } else {
                System.out.println("Paper is not a RuledPaper");
            }
        } else {
            System.out.println("Paper is null");
        }
    }
}

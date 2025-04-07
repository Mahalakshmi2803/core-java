package com.xworkz.temple.internal;

public class Powder {
    public Powder() {
        System.out.println("no-args constructor of Powder");
    }

    public void dissolve() {
        System.out.println("dissolve running in Powder");

        composition();
    }

    void color() {
        System.out.println("color running in Powder");
    }

    private void composition() {
        System.out.println("composition running in Powder");
    }
}


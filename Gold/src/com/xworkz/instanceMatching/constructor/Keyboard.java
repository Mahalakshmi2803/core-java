package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Keyboard {
    private String layout;
    private boolean isMechanical;
    private int numberOfKeys;
    private double price;

    public Keyboard(String layout, boolean isMechanical, int numberOfKeys, double price) {
        this.layout = layout;
        this.isMechanical = isMechanical;
        this.numberOfKeys = numberOfKeys;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "layout='" + layout + "', isMechanical=" + isMechanical + ", numberOfKeys=" + numberOfKeys + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Keyboard) {
            Keyboard other = (Keyboard) obj;
            if (Objects.equals(this.layout, other.layout) && this.isMechanical == other.isMechanical) {
                System.out.println("Keyboard is matching..");
                return true;
            }
        }
        return false;
    }
}

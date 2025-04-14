package com.xworkz.temple.overRiding.internal;

public class AnimatedLogo extends Logo {
    public AnimatedLogo() {
        System.out.println("AnimatedLogo constructor");
    }
    @Override
    public void display() {
        System.out.println("Displaying AnimatedLogo");
    }
    public void animate() {
        System.out.println("Animating Logo");
    }
}



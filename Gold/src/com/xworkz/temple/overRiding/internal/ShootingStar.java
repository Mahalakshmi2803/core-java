package com.xworkz.temple.overRiding.internal;

public class ShootingStar extends Star {
    public ShootingStar() {
        System.out.println("ShootingStar constructor");
    }
    @Override
    public void twinkle() {
        System.out.println("Shooting Star is twinkling swiftly");
    }
    public void shootAcrossSky() {
        System.out.println("Shooting Star is shooting across the sky");
    }
}



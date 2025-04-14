package com.xworkz.temple.overRiding.internal;

public class ComputerUser {
    public ComputerUser() {
        System.out.println("ComputerUser constructor");
    }
    public void show(Computer computer) {
        if (computer != null) {
            computer.work();
            if (computer instanceof Laptop) {
                Laptop laptop = (Laptop) computer;
                laptop.portable();
            } else {
                System.out.println("Computer is not a Laptop");
            }
        } else {
            System.out.println("Computer is null");
        }
    }
}

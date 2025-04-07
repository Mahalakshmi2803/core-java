package com.xworkz.temple.internal;

public class ShellCase {
    public ShellCase() {
        System.out.println("no-args constructor of ShellCase");
    }

    public void wrap() {
        System.out.println("wrap running in ShellCase");
        Shell shell = new Shell();
        shell.protect();
        shell.texture();
    }
}


package com.xworkz.temple.overRiding.internal;

public class SchoolPrincipal extends Principal {
    public SchoolPrincipal() {
        System.out.println("SchoolPrincipal constructor");
    }
    @Override
    public void manage() {
        System.out.println("Managing School efficiently");
    }
    public void supervise() {
        System.out.println("Supervising SchoolStaff");
    }
}



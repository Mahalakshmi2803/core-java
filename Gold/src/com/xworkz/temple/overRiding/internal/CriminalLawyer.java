package com.xworkz.temple.overRiding.internal;

public class CriminalLawyer extends Lawyer {
    public CriminalLawyer() {
        System.out.println("CriminalLawyer constructor");
    }
    @Override
    public void defend() {
        System.out.println("CriminalLawyer is defending a criminal case");
    }
    public void crossExamine() {
        System.out.println("CriminalLawyer is cross-examining");
    }
}



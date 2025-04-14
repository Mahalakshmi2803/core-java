package com.xworkz.temple.overRiding.internal;

public  class LawyerAssistant {
    public LawyerAssistant() {
        System.out.println("LawyerAssistant constructor");
    }
    public void show(Lawyer lawyer) {
        if (lawyer != null) {
            lawyer.defend();
            if (lawyer instanceof CriminalLawyer) {
                CriminalLawyer cl = (CriminalLawyer) lawyer;
                cl.crossExamine();
            } else {
                System.out.println("Lawyer is not a CriminalLawyer");
            }
        } else {
            System.out.println("Lawyer is null");
        }
    }
}

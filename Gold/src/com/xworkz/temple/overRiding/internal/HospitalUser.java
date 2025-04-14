package com.xworkz.temple.overRiding.internal;

public class HospitalUser extends Hospital {
    public HospitalUser() {
        System.out.println("HospitalUser constructor");
    }
    public void show(Hospital h) {
        if (h != null) {
            h.treat();
            if (h instanceof MultiSpecialityHospital) {
                MultiSpecialityHospital mh = (MultiSpecialityHospital) h;
                mh.emergency();
            } else {
                System.out.println("Not a MultiSpecialityHospital");
            }
        } else {
            System.out.println("Hospital is null");
        }
    }
}

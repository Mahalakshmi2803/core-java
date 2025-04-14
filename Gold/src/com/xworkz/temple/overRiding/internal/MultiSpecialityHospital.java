package com.xworkz.temple.overRiding.internal;

public  class MultiSpecialityHospital extends Hospital {
    public MultiSpecialityHospital() {
        System.out.println("MultiSpecialityHospital constructor");
    }
    @Override
    public void treat() {
        System.out.println("Treating in MultiSpecialityHospital");
    }
    public void emergency() {
        System.out.println("Emergency services in MultiSpecialityHospital");
    }
}



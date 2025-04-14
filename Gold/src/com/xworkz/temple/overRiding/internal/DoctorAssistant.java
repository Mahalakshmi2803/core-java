package com.xworkz.temple.overRiding.internal;

public class DoctorAssistant {
    public DoctorAssistant() {
        System.out.println("DoctorAssistant constructor");
    }
    public void show(Doctor doctor) {
        if (doctor != null) {
            doctor.diagnose();
            if (doctor instanceof Surgeon) {
                Surgeon s = (Surgeon) doctor;
                s.performSurgery();
            } else {
                System.out.println("Doctor is not a Surgeon");
            }
        } else {
            System.out.println("Doctor is null");
        }
    }
}

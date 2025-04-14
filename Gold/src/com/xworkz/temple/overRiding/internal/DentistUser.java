package com.xworkz.temple.overRiding.internal;

public class DentistUser {
    public DentistUser() {
        System.out.println("DentistUser constructor");
    }
    public void show(Dentist dentist) {
        if (dentist != null) {
            dentist.treat();
            if (dentist instanceof PediatricDentist) {
                PediatricDentist pd = (PediatricDentist) dentist;
                pd.treatChildren();
            } else {
                System.out.println("Dentist is not PediatricDentist");
            }
        } else {
            System.out.println("Dentist is null");
        }
    }
}

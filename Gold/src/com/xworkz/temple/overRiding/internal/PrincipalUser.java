package com.xworkz.temple.overRiding.internal;

public class PrincipalUser extends Principal {
    public PrincipalUser() {
        System.out.println("PrincipalUser constructor");
    }
    public void show(Principal p) {
        if (p != null) {
            p.manage();
            if (p instanceof SchoolPrincipal) {
                SchoolPrincipal sp = (SchoolPrincipal) p;
                sp.supervise();
            } else {
                System.out.println("Not a SchoolPrincipal");
            }
        } else {
            System.out.println("Principal is null");
        }
    }
}

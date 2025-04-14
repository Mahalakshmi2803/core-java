package com.xworkz.temple.overRiding.internal;

public class TeaUser {
    public TeaUser() {
        System.out.println("TeaUser constructor");
    }

    public void show(Tea tea) {
        if (tea != null) {
            tea.brew();
            if (tea instanceof GreenTea) {
                GreenTea greenTea = (GreenTea) tea;
                greenTea.addLemon();
            } else {
                System.out.println("Tea is not GreenTea");
            }
        } else {
            System.out.println("Tea is null");
        }
    }
}

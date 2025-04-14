package com.xworkz.temple.overRiding.internal;

public class Workplace {
    public void show(Desk desk) {
        if (desk != null) {
            desk.use();
            if (desk instanceof OfficeDesk) {
                ((OfficeDesk) desk).lockDrawer();
            } else {
                System.out.println("Not an OfficeDesk");
            }
        }
    }
}

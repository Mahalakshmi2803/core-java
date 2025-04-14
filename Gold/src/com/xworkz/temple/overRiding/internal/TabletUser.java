package com.xworkz.temple.overRiding.internal;

public class TabletUser {
    public TabletUser() {
        System.out.println("TabletUser constructor");
    }
    public void show(Tablet tablet) {
        if (tablet != null) {
            tablet.browse();
            if (tablet instanceof Ipad) {
                Ipad ipad = (Ipad) tablet;
                ipad.touch();
            } else {
                System.out.println("Tablet is not iPad");
            }
        } else {
            System.out.println("Tablet is null");
        }
    }
}

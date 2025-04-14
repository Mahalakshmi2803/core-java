package com.xworkz.temple.overRiding.internal;

public class SheetUser {
    public SheetUser() {
        System.out.println("SheetUser constructor");
    }
    public void show(Sheet sheet) {
        if (sheet != null) {
            sheet.place();
            if (sheet instanceof BedSheet) {
                BedSheet bs = (BedSheet) sheet;
                bs.iron();
            } else {
                System.out.println("Sheet is not a BedSheet");
            }
        } else {
            System.out.println("Sheet is null");
        }
    }
}

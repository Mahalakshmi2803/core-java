package com.xworkz.temple.overRiding.internal;

public class PasteUser {
    public PasteUser() {
        System.out.println("PasteUser constructor");
    }
    public void show(Paste paste) {
        if (paste != null) {
            paste.squeeze();
            if (paste instanceof ToothPaste) {
                ToothPaste tp = (ToothPaste) paste;
                tp.whitenTeeth();
            } else {
                System.out.println("Paste is not ToothPaste");
            }
        } else {
            System.out.println("Paste is null");
        }
    }
}

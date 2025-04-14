package com.xworkz.temple.overRiding.internal;

public class HangerUser {
    public void show(Hanger hanger) {
        hanger.hangClothes();
        if (hanger instanceof WoodenHanger) {
            ((WoodenHanger) hanger).polish();
        }
    }
}

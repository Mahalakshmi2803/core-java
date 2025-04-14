package com.xworkz.temple.overRiding.internal;

public class WoodenHanger extends Hanger {
    public WoodenHanger() {
        System.out.println("WoodenHanger constructor");
    }
    @Override
    public void hangClothes() {
        System.out.println("WoodenHanger is hanging clothes stylishly");
    }
    public void polish() {
        System.out.println("WoodenHanger is polished");
    }
}



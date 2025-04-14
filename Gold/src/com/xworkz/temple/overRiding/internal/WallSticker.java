package com.xworkz.temple.overRiding.internal;

public class WallSticker extends Sticker {
    public WallSticker() {
        System.out.println("WallSticker constructor");
    }
    @Override
    public void stick() {
        System.out.println("WallSticker is sticking on the wall");
    }
    public void decorate() {
        System.out.println("WallSticker is decorating the wall");
    }
}



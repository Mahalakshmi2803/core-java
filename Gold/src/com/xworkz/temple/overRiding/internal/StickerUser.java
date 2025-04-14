package com.xworkz.temple.overRiding.internal;

public class StickerUser {
    public StickerUser() {
        System.out.println("StickerUser constructor");
    }
    public void show(Sticker sticker) {
        if (sticker != null) {
            sticker.stick();
            if (sticker instanceof WallSticker) {
                WallSticker ws = (WallSticker) sticker;
                ws.decorate();
            } else {
                System.out.println("Sticker is not a WallSticker");
            }
        } else {
            System.out.println("Sticker is null");
        }
    }
}

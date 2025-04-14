package com.xworkz.temple.overRiding.internal;

public class HotelUser extends Hotel {
    public HotelUser() {
        System.out.println("HotelUser constructor");
    }
    public void show(Hotel h) {
        if (h != null) {
            h.serve();
            if (h instanceof FiveStarHotel) {
                FiveStarHotel fh = (FiveStarHotel) h;
                fh.spa();
            } else {
                System.out.println("Not a FiveStarHotel");
            }
        } else {
            System.out.println("Hotel is null");
        }
    }
}

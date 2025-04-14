package com.xworkz.temple.overRiding.internal;

public class FiveStarHotel extends Hotel {
    public FiveStarHotel() {
        System.out.println("FiveStarHotel constructor");
    }
    @Override
    public void serve() {
        System.out.println("Serving luxuriously in FiveStarHotel");
    }
    public void spa() {
        System.out.println("Offering spa in FiveStarHotel");
    }
}



package com.project.interfaces.runner;

import com.project.interfaces.external.HotelManagement;
import com.project.interfaces.internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new HotelManagement();
        hotel.bar();
        hotel.address();
        hotel.lounge();
        hotel.name();
        hotel.pool();
        hotel.restaurant();
        hotel.room();
        HotelManagement hotelManagement=new HotelManagement();
        hotelManagement.bar();
        hotelManagement.address();
        hotelManagement.lounge();
        hotelManagement.name();
        hotelManagement.pool();
        hotelManagement.restaurant();
        hotelManagement.room();
    }
}

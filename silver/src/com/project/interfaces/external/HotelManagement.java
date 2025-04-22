package com.project.interfaces.external;

import com.project.interfaces.internal.Hotel;

public class HotelManagement implements Hotel {
    @Override
    public void pool() {
        System.out.println("pool running in HotelManagement");
    }

    @Override
    public void address() {
        System.out.println("address running in HotelManagement");
    }

    @Override
    public void bar() {
        System.out.println("bar running in HotelManagement");
    }

    @Override
    public void lounge() {
        System.out.println("lounge running in HotelManagement");
    }

    @Override
    public void name() {
        System.out.println("room running in HotelManagement");
    }

    @Override
    public void restaurant() {
        System.out.println("restaurant running in HotelManagement");
    }

    @Override
    public void room() {
        System.out.println("room running in HotelManagement");
    }
}

package com.project.interfaces.external;

import com.project.interfaces.internal.Apartment;

public class ApartmentDetails implements Apartment {

    @Override
    public void indoorGames() {
        System.out.println("indoorGames running in ApartmentDetails");
    }

    @Override
    public void size() {
        System.out.println("size running in ApartmentDetails");
    }

    @Override
    public void noOfRooms() {
        System.out.println("noOfRooms running in ApartmentDetails");
    }

    @Override
    public void pool() {
        System.out.println("pool running in ApartmentDetails");
    }

    @Override
    public void rent() {
        System.out.println("rent running in ApartmentDetails");
    }
}

package com.project.interfaces.external;

import com.project.interfaces.internal.Home;

public class HomeTour implements Home
{
    @Override
    public void floors() {
        System.out.println("floors running in HomeTour");
    }

    @Override
    public void hall() {
        System.out.println("hall running in HomeTour");
    }

    @Override
    public void homeSize() {
        System.out.println("homeSize running in HomeTour");
    }

    @Override
    public void homeTheatre() {
        System.out.println("homeTheatre running in HomeTour");
    }

    @Override
    public void kitchen() {
        System.out.println("kitchen running in HomeTour");
    }

    @Override
    public void laundryRoom() {
        System.out.println("laundryRoom running in HomeTour");
    }

    @Override
    public void bedRooms() {
        System.out.println("bedRooms running in HomeTour");
    }

    @Override
    public void utility() {
        System.out.println("utility running in HomeTour");
    }

    @Override
    public void veranda() {
        System.out.println("veranda running in HomeTour");
    }
}

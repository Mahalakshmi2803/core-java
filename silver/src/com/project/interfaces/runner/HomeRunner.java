package com.project.interfaces.runner;

import com.project.interfaces.external.HomeTour;
import com.project.interfaces.internal.Home;

public class HomeRunner {
    public static void main(String[] args) {
        Home home=new HomeTour();
        home.bedRooms();
        home.homeSize();
        home.homeTheatre();
        home.floors();
        home.hall();
        home.laundryRoom();
        home.utility();
        home.veranda();
        home.kitchen();
        HomeTour homeTour=new HomeTour();
        homeTour.bedRooms();
        homeTour.homeSize();
        homeTour.homeTheatre();
        homeTour.floors();
        homeTour.hall();
        homeTour.laundryRoom();
        homeTour.utility();
        homeTour.veranda();
        homeTour.kitchen();

    }
}

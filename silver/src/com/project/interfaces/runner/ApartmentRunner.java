package com.project.interfaces.runner;

import com.project.interfaces.external.ApartmentDetails;
import com.project.interfaces.internal.Apartment;

public class ApartmentRunner {
    public static void main(String[] args) {
        Apartment apartment=new ApartmentDetails();
        apartment.indoorGames();
        apartment.pool();
        apartment.noOfRooms();
        apartment.rent();
        apartment.size();
        ApartmentDetails apartmentDetails=new ApartmentDetails();
        apartmentDetails.size();
        apartmentDetails.indoorGames();
        apartmentDetails.pool();
        apartmentDetails.rent();
        apartmentDetails.noOfRooms();
    }
}

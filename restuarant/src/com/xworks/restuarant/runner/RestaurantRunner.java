package com.xworks.restuarant.runner;

import com.xworks.restuarant.dto.RestuarantDTO;
import com.xworks.restuarant.exception.*;
import com.xworks.restuarant.service.RestuarantService;
import com.xworks.restuarant.service.RestuarantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestuarantDTO restaurantDto = new RestuarantDTO();
        restaurantDto.setName("A2B");
        restaurantDto.setLocation("Challakere");
        restaurantDto.setContactDetails(854699138);
        restaurantDto.setEmail("a2b@gmail.com");
        restaurantDto.setRating(3);
        restaurantDto.setFoodMenu(new String[]{"Gobi, Masalapapad, PaneerRice"});
        restaurantDto.setType(false);
        restaurantDto.setOpeningTime(LocalTime.of(9,0));
        restaurantDto.setClosingTime(LocalTime.of(12,0));
        restaurantDto.setBookedDate(LocalDate.now());
        restaurantDto.setBookedTime(LocalTime.of(10,0));


        RestuarantService restaurantService = new RestuarantServiceImpl();
        try{
            restaurantService.validateAndSave(restaurantDto);
        }catch(Exception e){
            System.out.println("validation failed "+ e.getMessage());

        }

    }
}

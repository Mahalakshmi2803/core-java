package com.xworks.restuarant.service;

import com.xworks.restuarant.dto.RestuarantDTO;
import com.xworks.restuarant.exception.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestuarantServiceImpl implements RestuarantService {
    @Override
    public boolean validateAndSave(RestuarantDTO restaurantDto) throws
            NameLengthException, RatingException, EmptyArrayException, BeforeAndAfterTimeException, NameLengthException, BookingTimeException, PreviousDayException {
        if (restaurantDto == null) {
            throw new NullPointerException("RestaurantDto is null");
        }
        String name = restaurantDto.getName();
        if (name == null || name.isEmpty()) {
            throw new NameLengthException("Name must not be null");
        }
        if (restaurantDto.getName().length() < 3) {
            throw new NameLengthException("Name must be at least 3 characters");
        }
        if (restaurantDto.getName().length() > 25) {
            throw new NameLengthException("Name must not exceed 25 characters");
        }
        if (Character.isDigit(restaurantDto.getName().charAt(0))) {
            throw new NameLengthException("Name should not start with number");
        }
        if (restaurantDto.getRating() < 3) {
            throw new RatingException("Rating should be greater than 3");
        }
        if (restaurantDto.getFoodMenu() == null) {
            throw new EmptyArrayException("Food menu should not be null");
        }
        if (restaurantDto.getFoodMenu().length == 0) {
            throw new ArrayIndexOutOfBoundsException("Food menu is Empty");
        }
        if (restaurantDto.getOpeningTime().isBefore(LocalTime.of(9, 0))) {
            throw new BeforeAndAfterTimeException("Opening Time must be After 9 AM");
        }
        if (restaurantDto.getClosingTime().isAfter(LocalTime.of(12, 0)) || (restaurantDto.getBookedDate().isBefore(LocalDate.now())) ){
            throw new BeforeAndAfterTimeException("Closing Time must be After 12 PM");
        }
        if (restaurantDto.getBookedDate().isBefore(LocalDate.now())) {
            throw new PreviousDayException("Booking date should be present day or upcoming days");
        }
        if (restaurantDto.getBookedTime().isBefore(LocalTime.of(9, 0)) || restaurantDto.getBookedTime().isAfter(LocalTime.of(12, 0))) {
            throw new BookingTimeException("Booking Time must be between the 9 AM to 12 PM");

        }
        System.out.println("all are valid");
        return true;
    }
}

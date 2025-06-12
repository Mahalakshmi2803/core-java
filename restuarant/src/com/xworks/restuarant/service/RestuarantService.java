package com.xworks.restuarant.service;

import com.xworks.restuarant.dto.RestuarantDTO;
import com.xworks.restuarant.exception.*;

import javax.naming.InvalidNameException;

public interface RestuarantService {
    boolean validateAndSave(RestuarantDTO restaurantDto) throws PreviousDayException, RatingException, EmptyArrayException, BeforeAndAfterTimeException, NameLengthException, BookingTimeException, StartsWithNumberException;

}

package com.xworks.restuarant.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RestuarantDTO {

    private String name;
    private String location;
    private long contactDetails;
    private String email;
    private double rating;
    private String[] foodMenu;
    private boolean type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;


}

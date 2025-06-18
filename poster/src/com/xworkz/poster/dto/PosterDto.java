package com.xworkz.poster.dto;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PosterDto {

    private String posterName;
    private String posterColor;
    private String posterMaterial;
    private String posterLengthInCm;
    private String posterReleaseDate;
    private String IsAGoodPoster;


    public PosterDto(String name, String color, String material, int length, LocalDate releaseDate, boolean goodOrBad) {
    }
}


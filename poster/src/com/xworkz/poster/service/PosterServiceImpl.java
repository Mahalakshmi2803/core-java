package com.xworkz.poster.service;

import com.xworkz.poster.dto.PosterDto;

public class PosterServiceImpl implements PosterService {

    @Override
    public boolean save(PosterDto posterDto) {

        if (posterDto.getPosterName() == null || posterDto.getPosterName().length() < 2) {
            System.out.println("Invalid poster");
        }

        if (posterDto.getPosterLengthInCm() == null ) {
            System.out.println("Min Temp is required");
        }

        return true;
        }

    }


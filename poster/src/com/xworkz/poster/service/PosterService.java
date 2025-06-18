package com.xworkz.poster.service;

import com.xworkz.poster.dto.PosterDto;

import java.util.Optional;

public interface PosterService {

    public boolean save(PosterDto posterDto);
    default Optional<PosterDto> findById(int id)
    {
        return  Optional.empty();
    }
}

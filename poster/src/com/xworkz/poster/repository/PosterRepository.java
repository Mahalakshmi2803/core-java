package com.xworkz.poster.repository;

import com.xworkz.poster.dto.PosterDto;

import java.util.Optional;

public interface PosterRepository {

    String persist(PosterDto posterDto);
    default Optional<PosterDto> findById(int id)
    {
        return  Optional.empty();
    }
}

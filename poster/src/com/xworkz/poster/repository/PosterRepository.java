package com.xworkz.poster.repository;

import com.xworkz.poster.dto.PosterDto;

public interface PosterRepository {

    String persist(PosterDto posterDto);

}

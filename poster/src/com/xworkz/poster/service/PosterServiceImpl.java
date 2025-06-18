package com.xworkz.poster.service;

import com.xworkz.poster.dto.PosterDto;
import com.xworkz.poster.repository.PosterRepository;
import com.xworkz.poster.repository.PosterRepositoryImpl;

import java.util.Optional;

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

    public Optional<PosterDto> findById(int id) {//>0
        System.out.println("running findById in dusterServiceImpl...");
        if(id>0)
        {
            System.out.println("id is valid :"+id);// call the repo
            PosterRepository posterRepository=new PosterRepositoryImpl();
            return posterRepository.findById(id);
        }

        return PosterService.super.findById(id);
    }

    }


package com.xworkz.mart.repository;

import com.xworkz.mart.dto.AppliancesDTO;

public interface AppliancesRepo {
    boolean persist(AppliancesDTO productDTO);
}
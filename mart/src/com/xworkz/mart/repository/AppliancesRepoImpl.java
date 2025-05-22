package com.xworkz.mart.repository;


import com.xworkz.mart.dto.AppliancesDTO;

public class AppliancesRepoImpl implements AppliancesRepo {

    public AppliancesRepoImpl(){
        System.out.println("no-arg constructor of ProductRepoImpl");
    }
    @Override
    public boolean persist(AppliancesDTO productDTO) {
        if(productDTO!=null){
            System.out.println("productDTO is not null");
        }else{
            System.out.println("productDTO is null");
        }
        System.out.println("persist method in ProductRepoImpl");
        return true;
    }


}
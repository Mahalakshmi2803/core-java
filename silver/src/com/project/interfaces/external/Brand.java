package com.project.interfaces.external;

import com.project.interfaces.internal.Showroom;

public class Brand implements Showroom {

    @Override
    public void shelf(){
        System.out.println("shelf running in Brand");
    }
}

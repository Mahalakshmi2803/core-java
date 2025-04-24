package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Majestic;

public class Bus {

    private Majestic majestic;

    public Bus(Majestic majestic){
        this.majestic=majestic;
    }

    public void stand(){
        System.out.println("stand running in Bus");
        if(majestic!=null){
            this.majestic.connect();
        }
        else{
            System.out.println("majestic is null");
        }
    }
}

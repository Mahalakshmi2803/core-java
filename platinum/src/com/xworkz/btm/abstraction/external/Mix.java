package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Juice;

public class Mix {

    private Juice juice;

    public Mix(Juice juice){
        this.juice=juice;

    }

    public void drink(){
        System.out.println("drink running in Mix");
        if(juice!=null){
            this.juice.making();
        }
        else{
            System.out.println("juice is null");
        }
    }
}

package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Mart;

public class Bill {

    private Mart mart;

    public Bill(Mart mart){
        this.mart=mart;
    }

    public void payment(){
        System.out.println("payment running in Bill");
        if(mart!=null){
            this.mart.buy();
        }
        else{
            System.out.println("mart is null");
        }
    }

}

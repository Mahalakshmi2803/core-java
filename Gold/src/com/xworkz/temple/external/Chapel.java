package com.xworkz.temple.external;

import com.xworkz.temple.internal.Church;

public class Chapel {

    public Chapel(){
        System.out.println("no-args constructor of Chapel");

    }

    public void prays(){
        System.out.println("prays running in Chapel");
        Church church=new Church();
        church.prayer();
    }
}

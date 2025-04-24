package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Juice;

public class AddSugar implements Juice {

    @Override
    public void making() {
        System.out.println("making running in AddSugar");
    }
}
